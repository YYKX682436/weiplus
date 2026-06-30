package ru;

/* loaded from: classes12.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f399626f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f399627g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f399628h;

    /* renamed from: i, reason: collision with root package name */
    public long f399629i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ru.u f399631n;

    /* renamed from: o, reason: collision with root package name */
    public int f399632o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ru.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399631n = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399630m = obj;
        this.f399632o |= Integer.MIN_VALUE;
        return this.f399631n.y(this);
    }
}
