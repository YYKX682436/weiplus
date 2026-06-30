package gm2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.i f273365a = new gm2.i(null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287, null);

    public final gm2.j a() {
        gm2.c1 c1Var = gm2.c1.f273320a;
        gm2.i iVar = this.f273365a;
        gm2.j jVar = new gm2.j(gm2.c1.c(c1Var, iVar.a() + iVar.f273404o + iVar.f273405p, 0, 2, null));
        jVar.f273416d = iVar;
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gm2.f b(int r12, gm2.e r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm2.f.b(int, gm2.e):gm2.f");
    }

    public final gm2.f c(java.lang.String str) {
        gm2.i iVar = this.f273365a;
        if (!(str == null || str.length() == 0)) {
            try {
                iVar.f273402m = android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                iVar.f273402m = 0;
                com.tencent.mars.xlog.Log.e("FinderLiveFansSpan", e17 + ",serverColor:" + str);
            }
        }
        return this;
    }
}
