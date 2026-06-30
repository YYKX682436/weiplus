package zl2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.a f473632a = new zl2.a();

    public final void a(android.widget.ImageView img, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        kotlin.jvm.internal.o.g(img, "img");
        boolean z17 = finderContact != null;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z17 && com.tencent.mm.storage.z3.S3(finderContact.getUsername())) {
            g1Var.a().c(new mn2.q3(finderContact.getHeadUrl(), com.tencent.mm.plugin.finder.storage.y90.f128356f), img, g1Var.h(mn2.f1.f329957h));
        } else {
            g1Var.l().c(new mn2.q3(finderContact != null ? finderContact.getHeadUrl() : null, com.tencent.mm.plugin.finder.storage.y90.f128356f), img, g1Var.h(mn2.f1.f329961o));
        }
    }
}
