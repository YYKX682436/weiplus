package s65;

/* loaded from: classes11.dex */
public class a0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s65.g0 f403431a;

    public a0(s65.g0 g0Var) {
        this.f403431a = g0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (1 == message.what) {
            s65.g0 g0Var = this.f403431a;
            if (g0Var.f403463n) {
                return;
            }
            com.tencent.mm.vfs.w6.h(g0Var.d());
            int i17 = message.arg1;
            if (i17 == 0) {
                g0Var.f403458i.d(200, 0, (r45.js5) message.obj);
            } else if (i17 == 3) {
                g0Var.f403458i.d(3, -1, (r45.js5) message.obj);
            } else if (i17 == 4) {
                g0Var.f403458i.d(4, -1, (r45.js5) message.obj);
            }
        }
    }
}
