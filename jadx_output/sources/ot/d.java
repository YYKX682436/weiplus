package ot;

/* loaded from: classes9.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot.g f348300e;

    /* renamed from: f, reason: collision with root package name */
    public int f348301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ot.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f348300e = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f348299d = obj;
        this.f348301f |= Integer.MIN_VALUE;
        return this.f348300e.Zi(null, null, this);
    }
}
