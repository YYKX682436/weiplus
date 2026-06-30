package kh;

/* loaded from: classes12.dex */
public final class m3 extends kh.o3 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f307868c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.i3 f307869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.String pattern, kh.i3 i3Var) {
        super(i3Var);
        kotlin.jvm.internal.o.g(pattern, "pattern");
        this.f307868c = pattern;
        this.f307869d = i3Var;
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        kh.i3 i3Var;
        kotlin.jvm.internal.o.g(name, "name");
        if (!r26.i0.y(name, this.f307868c, false) || (i3Var = this.f307869d) == null) {
            return null;
        }
        return i3Var.a(this, name);
    }

    public /* synthetic */ m3(java.lang.String str, kh.i3 i3Var, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? kh.h3.f307824a : i3Var);
    }
}
