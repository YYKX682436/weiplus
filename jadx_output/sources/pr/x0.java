package pr;

/* loaded from: classes15.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f357796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f357797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(pr.a1 a1Var, com.tencent.mm.api.IEmojiInfo iEmojiInfo, int i17) {
        super(0);
        this.f357796d = a1Var;
        this.f357797e = iEmojiInfo;
        this.f357798f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pr.v0 v0Var;
        pr.u0 u0Var = (pr.u0) this.f357796d.f357690b.remove(this.f357797e.getMd5());
        if (u0Var != null && (v0Var = this.f357796d.f357691c) != null) {
            int i17 = this.f357798f;
            pr.k0 k0Var = ((pr.h0) v0Var).f357715a;
            synchronized (k0Var.f357743p) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = u0Var.f357792a;
                com.tencent.mars.xlog.Log.i(k0Var.f357730c, "onLoaderFin: " + emojiInfo.getMd5() + ' ' + i17 + ", " + u0Var.f357793b);
                k0Var.f357737j.remove(emojiInfo.getMd5());
                if (k0Var.f357737j.size() <= 0) {
                    k0Var.f357735h = false;
                }
                k0Var.f357740m++;
                int i18 = u0Var.f357793b;
                k0Var.f357729b.getClass();
                if ((i18 % 5 == 3) || !k0Var.f357735h) {
                    int i19 = i18 + 1;
                    if (k0Var.f357732e < i19) {
                        k0Var.f357732e = i19;
                    }
                    int i27 = k0Var.f357731d;
                    int i28 = k0Var.f357740m + i27;
                    k0Var.f357731d = i28;
                    int i29 = k0Var.f357733f;
                    if (i28 == i29 && i29 == k0Var.f357734g) {
                        k0Var.f357736i = true;
                    }
                    if (!k0Var.f357735h) {
                        k0Var.f357732e = i29;
                    }
                    java.util.Iterator it = k0Var.f357738k.iterator();
                    while (it.hasNext()) {
                        ((pr.e0) it.next()).a(k0Var.f357731d - i27);
                    }
                    k0Var.f357740m = 0;
                }
            }
        }
        pr.a1 a1Var = this.f357796d;
        a1Var.getClass();
        pm0.v.X(new pr.w0(a1Var));
        return jz5.f0.f302826a;
    }
}
