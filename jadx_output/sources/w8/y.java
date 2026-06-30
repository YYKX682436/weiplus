package w8;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f443795a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.o[] f443796b;

    public y(java.util.List list) {
        this.f443795a = list;
        this.f443796b = new q8.o[list.size()];
    }

    public void a(q8.g gVar, w8.g0 g0Var) {
        int i17 = 0;
        while (true) {
            q8.o[] oVarArr = this.f443796b;
            if (i17 >= oVarArr.length) {
                return;
            }
            g0Var.a();
            g0Var.b();
            q8.o l17 = gVar.l(g0Var.f443644d, 3);
            com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) this.f443795a.get(i17);
            java.lang.String str = format.f44080i;
            t9.a.b(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            java.lang.String str2 = format.f44075d;
            if (str2 == null) {
                g0Var.b();
                str2 = g0Var.f443645e;
            }
            l17.c(com.google.android.exoplayer2.Format.i(str2, str, null, -1, format.D, format.E, format.F, null, com.tencent.wcdb.core.Database.DictDefaultMatchValue, java.util.Collections.emptyList()));
            oVarArr[i17] = l17;
            i17++;
        }
    }
}
