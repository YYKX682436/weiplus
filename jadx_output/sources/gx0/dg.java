package gx0;

/* loaded from: classes5.dex */
public final class dg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f276344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f276346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(android.widget.FrameLayout frameLayout, gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f276344d = frameLayout;
        this.f276345e = ggVar;
        this.f276346f = continuation;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx0.gg ggVar = this.f276345e;
        android.view.View view = ggVar.f276481q;
        android.widget.FrameLayout frameLayout = this.f276344d;
        int childCount = frameLayout.getChildCount();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, j65.q.a(ggVar.getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.f479675cc));
        layoutParams.gravity = 80;
        frameLayout.addView(view, childCount, layoutParams);
        ggVar.f276481q.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(255, 17, 17, 17), android.graphics.Color.argb(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, 17, 17, 17), android.graphics.Color.argb(com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX, 17, 17, 17), android.graphics.Color.argb(242, 17, 17, 17), android.graphics.Color.argb(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, 17, 17, 17), android.graphics.Color.argb(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, 17, 17, 17), android.graphics.Color.argb(207, 17, 17, 17), android.graphics.Color.argb(191, 17, 17, 17), android.graphics.Color.argb(ib1.t.CTRL_INDEX, 17, 17, 17), android.graphics.Color.argb(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, 17, 17, 17), android.graphics.Color.argb(131, 17, 17, 17), android.graphics.Color.argb(108, 17, 17, 17), android.graphics.Color.argb(83, 17, 17, 17), android.graphics.Color.argb(56, 17, 17, 17), android.graphics.Color.argb(29, 17, 17, 17), android.graphics.Color.argb(0, 17, 17, 17)}));
        ggVar.X6();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f276346f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        return jz5.f0.f302826a;
    }
}
