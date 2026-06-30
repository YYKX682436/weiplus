package ru0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ru0.i f399677d = new ru0.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(uu0.l.b(), "subtitleCacheDir");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var;
    }
}
