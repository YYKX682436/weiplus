package vh4;

/* loaded from: classes.dex */
public final class p2 extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        gm0.j1.a();
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).bg(true);
        }
    }
}
