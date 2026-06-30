package xp4;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455936d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xp4.b f455938f;

    /* renamed from: g, reason: collision with root package name */
    public int f455939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xp4.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455938f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455937e = obj;
        this.f455939g |= Integer.MIN_VALUE;
        return this.f455938f.a(null, null, this);
    }
}
