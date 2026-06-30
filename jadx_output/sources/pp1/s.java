package pp1;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f357438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, pp1.z zVar) {
        super(0);
        this.f357438d = context;
        this.f357439e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this.f357438d, 0, false);
        wxLinearLayoutManager.S(!this.f357439e.f357454o);
        wxLinearLayoutManager.f11881u = 5;
        return wxLinearLayoutManager;
    }
}
