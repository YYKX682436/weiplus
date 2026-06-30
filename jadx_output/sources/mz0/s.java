package mz0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mz0.s f333038d = new mz0.s();

    public s() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.repairer.config.mjtemplate.RepairerConfigTemplateSelectNonBlocking repairerConfigTemplateSelectNonBlocking = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigTemplateSelectNonBlocking();
        int h17 = bm5.o1.f22719a.h(repairerConfigTemplateSelectNonBlocking);
        boolean z17 = true;
        if (h17 != 1 && (h17 == 2 || 1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(repairerConfigTemplateSelectNonBlocking))) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "enableSelectTemplateNonBlocking: local:" + h17 + ", result:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
