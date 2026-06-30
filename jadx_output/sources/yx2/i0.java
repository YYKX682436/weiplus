package yx2;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f467857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f467855d = context;
        this.f467856e = snsFinderVideoBackPreview;
        this.f467857f = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx2.f fVar;
        yx2.f fVar2;
        boolean enablePlay;
        android.content.Context context = this.f467855d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f467856e;
            fVar = snsFinderVideoBackPreview.finderDetailLoader;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f467857f;
            fVar.c(finderObject);
            fVar2 = snsFinderVideoBackPreview.finderDetailLoader;
            fVar2.a();
            snsFinderVideoBackPreview.createFinderPlayView(context, finderObject);
            enablePlay = snsFinderVideoBackPreview.enablePlay();
            if (enablePlay) {
                snsFinderVideoBackPreview.playVideo();
            }
        }
        return jz5.f0.f302826a;
    }
}
