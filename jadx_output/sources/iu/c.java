package iu;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu.h f294657e;

    /* renamed from: f, reason: collision with root package name */
    public int f294658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294657e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294656d = obj;
        this.f294658f |= Integer.MIN_VALUE;
        return this.f294657e.i(null, null, this);
    }
}
