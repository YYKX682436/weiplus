package si0;

/* loaded from: classes4.dex */
public final class s0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f408165d;

    public s0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f408165d = snsInfo;
    }

    public static final void a(si0.s0 s0Var, com.tencent.mm.protocal.protobuf.SnsObject snsObject, bw5.nk0 nk0Var) {
        s0Var.getClass();
        kotlin.jvm.internal.o.f(nk0Var.f30714g, "getIncludeFriends(...)");
        if (!r3.isEmpty()) {
            snsObject.ExtFlag |= 512;
        } else {
            snsObject.ExtFlag &= -513;
        }
        kotlin.jvm.internal.o.f(nk0Var.f30712e, "getIncludeLabels(...)");
        if (!r3.isEmpty()) {
            snsObject.ExtFlag |= 512;
        } else {
            snsObject.ExtFlag &= -513;
        }
        kotlin.jvm.internal.o.f(nk0Var.f30720p, "getExcludeFriends(...)");
        if (!r3.isEmpty()) {
            snsObject.ExtFlag |= 2;
        } else {
            snsObject.ExtFlag &= -3;
        }
        kotlin.jvm.internal.o.f(nk0Var.f30718n, "getExcludeLabels(...)");
        if (!r3.isEmpty()) {
            snsObject.ExtFlag |= 1024;
        } else {
            snsObject.ExtFlag &= -1025;
        }
        kotlin.jvm.internal.o.f(nk0Var.f30716i, "getInteractFriends(...)");
        if (!r3.isEmpty()) {
            snsObject.ExtFlag |= 4096;
        } else {
            snsObject.ExtFlag &= -4097;
        }
        cj0.a aVar = cj0.a.f41853a;
        java.util.ArrayList f17 = aVar.f(nk0Var);
        ca4.e1 e1Var = ca4.f1.f39897a;
        snsObject.GroupUser = e1Var.v(f17);
        snsObject.GroupUserCount = nk0Var.f30714g.size();
        snsObject.GroupContactTagIdList = new java.util.LinkedList<>(aVar.g(nk0Var));
        snsObject.GroupContactTagIdListCount = nk0Var.f30712e.size();
        snsObject.BlackList = e1Var.v(aVar.a(nk0Var));
        snsObject.BlackListCount = nk0Var.f30720p.size();
        snsObject.BlackContactTagIdList = new java.util.LinkedList<>(aVar.b(nk0Var));
        snsObject.BlackContactTagIdListCount = nk0Var.f30718n.size();
        snsObject.RecentInteractUserList = e1Var.v(aVar.i(nk0Var));
        snsObject.RecentInteractUserCount = nk0Var.f30716i.size();
    }

    public static final void b(si0.s0 s0Var, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        s0Var.getClass();
        snsObject.BlackList.clear();
        snsObject.BlackListCount = 0;
        snsObject.BlackContactTagIdList.clear();
        snsObject.BlackContactTagIdListCount = 0;
        snsObject.GroupUser.clear();
        snsObject.GroupUserCount = 0;
        snsObject.GroupContactTagIdList.clear();
        snsObject.GroupContactTagIdListCount = 0;
        snsObject.RecentInteractUserList.clear();
        snsObject.RecentInteractUserCount = 0;
        snsObject.ExtFlag &= -5639;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate
    public void onChangeSnsVisibilitySuccCallback(java.lang.String str, byte[] bArr) {
        if (str == null || bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlatformChangeVisibilityDelegateImpl", "onChangeSnsVisibilitySuccCallback >> error");
            return;
        }
        bw5.nk0 parseFrom = new bw5.nk0().parseFrom(bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "onChangeSnsVisibilitySuccCallback >> snsId: ".concat(str));
        cj0.a aVar = cj0.a.f41853a;
        kotlin.jvm.internal.o.d(parseFrom);
        aVar.l("MicroMsg.PlatformChangeVisibilityDelegateImpl", parseFrom);
        ((ku5.t0) ku5.t0.f312615d).g(new si0.r0(this, parseFrom, str));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsChangeVisibilityDelegate.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
