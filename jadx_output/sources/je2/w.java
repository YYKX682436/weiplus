package je2;

/* loaded from: classes3.dex */
public final class w extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f299279f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f299280g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299281h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f299282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299279f = "LiveOneClickGiftSlice";
        this.f299281h = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        dk2.ef.f233392k.f(17);
        this.f299280g = null;
        this.f299282i = null;
    }
}
