package ss2;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ss2.a0 a0Var) {
        super(0);
        this.f411991d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        java.lang.String f17;
        com.tencent.mm.vfs.x1 m17;
        ss2.a0 a0Var = this.f411991d;
        android.os.Bundle bundle = a0Var.A;
        com.tencent.mm.vfs.z2 z2Var = null;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle != null ? bundle.getStringArrayList("VIDEO_THUMB_LIST") : null;
        java.util.ArrayList arrayList = a0Var.f411917s;
        arrayList.clear();
        java.util.ArrayList arrayList2 = a0Var.f411911m;
        if (arrayList2 != null) {
            boolean z17 = false;
            int i17 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) obj;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, z17, z17);
                    if (!str3.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, z2Var);
                com.tencent.mars.xlog.Log.i("PostMediaWidget", "path %s video file size %d", str2, java.lang.Long.valueOf((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L));
                kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                if (stringArrayList == null || stringArrayList.size() <= i17 || com.tencent.mm.sdk.platformtools.t8.K0(stringArrayList.get(i17))) {
                    mv2.q qVar = mv2.q.f331618a;
                    h0Var2.f310123d = qVar.k(str2, 4);
                    com.tencent.mars.xlog.Log.i("PostMediaWidget", "genVideoThumbFileTmp input:" + str2 + ", targetWidth:" + ((android.graphics.Point) h0Var2.f310123d).x + ", targetHeight:" + ((android.graphics.Point) h0Var2.f310123d).y);
                    android.graphics.Point point = (android.graphics.Point) h0Var2.f310123d;
                    h0Var = h0Var2;
                    str = "PostMediaWidget";
                    f17 = qVar.f(str2, point.x, point.y, null, "");
                } else {
                    h0Var2.f310123d = mv2.q.f331618a.k(str2, 2);
                    f17 = stringArrayList.get(i17);
                    h0Var = h0Var2;
                    str = "PostMediaWidget";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                    arrayList.add(f17);
                    com.tencent.mm.sdk.platformtools.u3.h(new ss2.v(a0Var, str2, f17, h0Var));
                    com.tencent.mars.xlog.Log.i(str, "add thumb file, index:" + i17);
                }
                i17 = i18;
                z2Var = null;
                z17 = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
