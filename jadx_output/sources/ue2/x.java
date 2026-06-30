package ue2;

/* loaded from: classes3.dex */
public final class x extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f426866p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f426867q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f426866p = "Finder.FinderLiveAudioModePreviewPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.enq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f426867q = (android.widget.ImageView) findViewById;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        r45.uo1 liveDesc;
        r45.uo1 liveDesc2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media3;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc3;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        if (ue2.r.f426852a[status.ordinal()] == 1) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
            sb6.append(z17);
            sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
            sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
            sb6.append(" liveDesc.cover:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) P0(mm2.c1.class)).f328846n;
            sb6.append((finderObject == null || (objectDesc2 = finderObject.getObjectDesc()) == null || (liveDesc3 = objectDesc2.getLiveDesc()) == null) ? null : liveDesc3.getString(0));
            sb6.append(" media.url:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
            sb6.append((finderObject2 == null || (objectDesc = finderObject2.getObjectDesc()) == null || (media3 = objectDesc.getMedia()) == null || (finderMedia3 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media3)) == null) ? null : finderMedia3.getUrl());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f426866p;
            com.tencent.mars.xlog.Log.i(str, sb7);
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            mm2.g1 g1Var = (mm2.g1) P0(mm2.g1.class);
            if (zl2.r4.f473950a.x1()) {
                if (z17) {
                    java.lang.String str2 = (java.lang.String) ((kotlinx.coroutines.flow.h3) g1Var.f329075p).getValue();
                    c1Var.w7();
                    pm0.v.X(new ue2.u(this, str2));
                } else {
                    K0(4);
                }
            } else if (z17) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = c1Var.f328846n;
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject3 != null ? finderObject3.getObjectDesc() : null;
                java.lang.String string = (objectDesc3 == null || (liveDesc2 = objectDesc3.getLiveDesc()) == null) ? null : liveDesc2.getString(0);
                if (string == null || string.length() == 0) {
                    java.lang.String url = (objectDesc3 == null || (media2 = objectDesc3.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) ? null : finderMedia2.getUrl();
                    if (url == null || url.length() == 0) {
                        java.lang.String str3 = V0().f309129d.f68542m;
                        kotlin.jvm.internal.o.d(str3);
                        r5 = str3.length() > 0 ? str3 : null;
                        if (r5 == null) {
                            r5 = c1Var.f328852o;
                        }
                        ya2.b2 b17 = c1Var.Y4 ? ya2.h.f460484a.b(c1Var.f328852o) : ya2.h.f460484a.b(r5);
                        r5 = b17 != null ? b17.y0() : "";
                    } else {
                        if (objectDesc3 != null && (media = objectDesc3.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                            r5 = finderMedia.getUrl();
                        }
                        kotlin.jvm.internal.o.d(r5);
                    }
                } else {
                    if (objectDesc3 != null && (liveDesc = objectDesc3.getLiveDesc()) != null) {
                        r5 = liveDesc.getString(0);
                    }
                    kotlin.jvm.internal.o.d(r5);
                }
                c1Var.w7();
                pm0.v.X(new ue2.u(this, r5));
            } else {
                K0(4);
            }
            if (z18) {
                K0(4);
            }
            com.tencent.mars.xlog.Log.i(str, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new ue2.w((mm2.g1) P0(mm2.g1.class), (mm2.c1) P0(mm2.c1.class), this, null), 3, null);
    }
}
