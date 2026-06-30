package kp3;

/* loaded from: classes14.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI f311067e;

    /* renamed from: f, reason: collision with root package name */
    public int f311068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f311067e = palmPrintFrontUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f311066d = obj;
        this.f311068f |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI.U6(this.f311067e, this);
    }
}
