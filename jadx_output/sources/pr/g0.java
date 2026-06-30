package pr;

/* loaded from: classes15.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f357707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pr.k0 k0Var, boolean z17) {
        super(0);
        this.f357707d = k0Var;
        this.f357708e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pr.k0 k0Var = this.f357707d;
        java.lang.Byte[] bArr = k0Var.f357743p;
        boolean z17 = this.f357708e;
        synchronized (bArr) {
            java.util.List a17 = k0Var.f357728a.a();
            k0Var.f357734g = a17.size();
            if (!k0Var.f357735h) {
                java.util.Iterator it = a17.iterator();
                boolean z18 = false;
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (!((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).w0()) {
                        break;
                    }
                    i17++;
                }
                if (i17 < 0 || i17 >= a17.size()) {
                    int i18 = k0Var.f357734g;
                    k0Var.f357733f = i18;
                    k0Var.f357731d = i18;
                    k0Var.f357732e = i18;
                    k0Var.f357736i = true;
                    pm0.v.X(new pr.f0(k0Var));
                } else {
                    k0Var.f357731d = i17;
                    if (i17 < ((pr.a0) k0Var.f357729b).a()) {
                        k0Var.f357733f = ((pr.a0) k0Var.f357729b).a();
                    } else {
                        k0Var.f357733f = k0Var.f357731d;
                    }
                    k0Var.f357732e = k0Var.f357731d;
                    k0Var.f357736i = k0Var.f357733f == k0Var.f357734g;
                }
                com.tencent.mars.xlog.Log.i(k0Var.f357730c, "checkSyncEmoji: " + k0Var.f357731d + ", " + k0Var.f357733f + ", " + k0Var.f357736i);
                if (z17) {
                    synchronized (k0Var.f357743p) {
                        com.tencent.mars.xlog.Log.i(k0Var.f357730c, "start: ");
                        if (k0Var.f357736i) {
                            k0Var.f357735h = false;
                        } else if (!k0Var.f357735h) {
                            z18 = true;
                        }
                        if (z18) {
                            k0Var.h();
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
