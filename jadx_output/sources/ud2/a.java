package ud2;

/* loaded from: classes10.dex */
public final class a implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f426576d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f426577e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426578f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f426579g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f426580h;

    /* renamed from: i, reason: collision with root package name */
    public final ud2.o f426581i;

    public a(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel, java.lang.String anchorUsername) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        this.f426576d = context;
        this.f426577e = methodChannel;
        this.f426578f = anchorUsername;
        this.f426579g = "ShopWindowVideoView";
        android.view.View view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b9_, (android.view.ViewGroup) null);
        this.f426580h = view;
        kotlin.jvm.internal.o.f(view, "view");
        ud2.o oVar = new ud2.o(view, this);
        v65.i.c(oVar.f426640g, null, new ud2.i(oVar, null), 1, null);
        this.f426581i = oVar;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        androidx.lifecycle.o mo133getLifecycle;
        ud2.o oVar = this.f426581i;
        com.tencent.mars.xlog.Log.i(oVar.f426636c, "dispose");
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f426639f;
        nearbyLivePreviewView.stop();
        nearbyLivePreviewView.release();
        nearbyLivePreviewView.r("completelyQuit");
        mn0.b0 b0Var = nearbyLivePreviewView.player;
        if (b0Var != null) {
            ((mn0.y) b0Var).w();
        }
        androidx.lifecycle.y d17 = oVar.d(oVar.f426635b.getView());
        if (d17 == null || (mo133getLifecycle = d17.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.c(oVar.f426645l);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        android.view.View view = this.f426580h;
        kotlin.jvm.internal.o.f(view, "view");
        return view;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result p17) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.nw1 liveInfo;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.nw1 liveInfo2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        r45.nw1 liveInfo3;
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mars.xlog.Log.i(this.f426579g, "on Method " + methodCall.method + " call, args = " + methodCall.arguments);
        if (kotlin.jvm.internal.o.b(methodCall.method, "sendJSEvent")) {
            java.lang.Object obj = methodCall.arguments;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
            java.lang.Object obj2 = ((java.util.HashMap) obj).get(ya.b.METHOD);
            boolean b17 = kotlin.jvm.internal.o.b(obj2, "resume");
            ig2.r rVar = null;
            ud2.o oVar = this.f426581i;
            if (b17) {
                oVar.getClass();
                v65.i.c(oVar.f426640g, null, new ud2.n(oVar, null), 1, null);
                return;
            }
            if (kotlin.jvm.internal.o.b(obj2, "stop")) {
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f426639f;
                if (nearbyLivePreviewView.isPlaying()) {
                    nearbyLivePreviewView.pause();
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.o.b(obj2, "enterLive")) {
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = oVar.f426639f;
                boolean isPlaying = nearbyLivePreviewView2.isPlaying();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = oVar.f426637d;
                boolean z17 = (finderItem == null || (feedObject4 = finderItem.getFeedObject()) == null || (liveInfo3 = feedObject4.getLiveInfo()) == null || liveInfo3.getInteger(2) != 1) ? false : true;
                boolean z18 = nearbyLivePreviewView2.isFirstFrameRendered;
                android.view.TextureView videoView = nearbyLivePreviewView2.getRenderView().getVideoView();
                boolean z19 = (videoView != null ? videoView.getSurfaceTexture() : null) != null;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = oVar.f426637d;
                boolean z27 = pm0.v.z((finderItem2 == null || (feedObject3 = finderItem2.getFeedObject()) == null || (liveInfo2 = feedObject3.getLiveInfo()) == null) ? 0 : (int) liveInfo2.getLong(32), 256);
                com.tencent.mars.xlog.Log.i(oVar.f426636c, "isPlaying = " + isPlaying + ", isFirstRendered = " + z18 + ", isSurfaceTextureAvailable = " + z19);
                if (isPlaying && z18 && !z27 && z17 && z19) {
                    ud2.a aVar = oVar.f426635b;
                    android.view.View view = aVar.getView();
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = oVar.f426637d;
                    if (finderItem3 != null && (feedObject = finderItem3.getFeedObject()) != null) {
                        long id6 = feedObject.getId();
                        ez2.a aVar2 = ez2.a.f257865q;
                        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = oVar.f426637d;
                        ig2.j jVar = new ig2.j(aVar2, id6, (finderItem4 == null || (feedObject2 = finderItem4.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0), view, nearbyLivePreviewView2.getF130757z(), nearbyLivePreviewView2.getA(), nearbyLivePreviewView2.getB(), nearbyLivePreviewView2.e(), nearbyLivePreviewView2.getRenderView().getVideoView(), false, false);
                        jVar.f291388m = aVar.getView();
                        rVar = ig2.m.f291393a.i(aVar.f426576d, jVar);
                    }
                }
                if (rVar != null) {
                    rVar.g(new ud2.e(oVar));
                }
            }
        }
    }
}
