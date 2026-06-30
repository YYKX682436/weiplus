package rl2;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.s4 f397208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dm.s4 s4Var) {
        super(1);
        this.f397208d = s4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((dm.s4) obj).field_liveId == this.f397208d.field_liveId);
    }
}
