package wi3;

/* loaded from: classes14.dex */
public final class c extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        wi3.l lVar = wi3.l.f446226a;
        wi3.l.f446230e = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "ON_PROCESS_ENTER_EXPLICIT_BACKGROUND");
        wi3.l.f446226a.c();
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        wi3.l lVar = wi3.l.f446226a;
        wi3.l.f446230e = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "ON_PROCESS_EXIT_EXPLICIT_BACKGROUND");
    }
}
