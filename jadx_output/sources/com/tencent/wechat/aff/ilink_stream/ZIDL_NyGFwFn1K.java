package com.tencent.wechat.aff.ilink_stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_NyGFwFn1K {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217207a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217208b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217209c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217210d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217211e = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_HI(byte[] bArr, int i17, byte[] bArr2) {
        com.tencent.wechat.aff.ilink_stream.x xVar;
        e70.c0 c0Var;
        e70.c0 c0Var2;
        e70.c0 c0Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamStateNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217207a;
        sb6.append(concurrentHashMap.size());
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", "onStreamStateNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ilink_stream.m mVar = (com.tencent.wechat.aff.ilink_stream.m) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            if (i17 == 0) {
                xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateOK;
            } else if (i17 == 1) {
                xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateNotExist;
            } else if (i17 == 2) {
                xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateEnding;
            } else if (i17 == 3) {
                xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateFragmentTooLarge;
            } else if (i17 != 400) {
                switch (i17) {
                    case 100:
                        xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateError;
                        break;
                    case 101:
                        xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateCancel;
                        break;
                    case 102:
                        xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateDataSyncError;
                        break;
                    case 103:
                        xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateDataLostError;
                        break;
                    case 104:
                        xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateAccountChanged;
                        break;
                    default:
                        xVar = null;
                        break;
                }
            } else {
                xVar = com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateServerAbort;
            }
            com.tencent.wechat.aff.ilink_stream.a aVar = (com.tencent.wechat.aff.ilink_stream.a) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.ilink_stream.a.f217213h, bArr2);
            d83.t0 t0Var = ((d83.n0) mVar).f227001a;
            d83.t0.a(t0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "subscribeStreamStateNotifyEvent() clientStreamId: " + str + ", code: " + xVar.name());
            int i18 = d83.m0.f226997a[xVar.ordinal()];
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = t0Var.f227023c;
            if (i18 == 1) {
                d83.h0 h0Var = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var != null && (c0Var3 = h0Var.f226978i) != null) {
                    ((d83.f0) c0Var3).f();
                }
            } else if (i18 != 2) {
                d83.h0 h0Var2 = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var2 != null && (c0Var = h0Var2.f226978i) != null) {
                    ((d83.f0) c0Var).g(xVar);
                }
            } else {
                d83.h0 h0Var3 = (d83.h0) concurrentHashMap2.get(str);
                if (h0Var3 != null && (c0Var2 = h0Var3.f226978i) != null) {
                    kotlin.jvm.internal.o.d(aVar);
                    ((d83.f0) c0Var2).d(aVar);
                }
            }
        }
    }

    private void ZIDL_II(byte[] bArr) {
        java.lang.Integer num;
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveStreamFragmentEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217208b;
        sb6.append(concurrentHashMap.size());
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", "onReceiveStreamFragmentEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ilink_stream.k kVar = (com.tencent.wechat.aff.ilink_stream.k) entry.getValue();
            com.tencent.wechat.aff.ilink_stream.f fVar = (com.tencent.wechat.aff.ilink_stream.f) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.ilink_stream.f.f217266i, bArr);
            d83.l0 l0Var = (d83.l0) kVar;
            l0Var.getClass();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onReceive clientStreamId: ");
            boolean z17 = true;
            sb7.append(fVar.f217271h[1] ? fVar.f217267d : "");
            sb7.append(", fragmentItems.size: ");
            java.util.LinkedList<com.tencent.wechat.aff.ilink_stream.u> linkedList = fVar.f217268e;
            sb7.append(linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", sb7.toString());
            d83.t0 t0Var = l0Var.f226993a;
            d83.t0.a(t0Var);
            boolean[] zArr = fVar.f217271h;
            java.lang.String str = zArr[1] ? fVar.f217267d : "";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.wechat.aff.ilink_stream.u uVar : linkedList) {
                com.tencent.mm.protobuf.g gVar = uVar.f217307f[2] ? uVar.f217306e : com.tencent.mm.protobuf.g.f192155b;
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            d83.h0 h0Var = (d83.h0) t0Var.f227023c.get(str);
            if (h0Var != null && (c0Var = h0Var.f226978i) != null) {
                ((d83.f0) c0Var).e(arrayList);
            }
            if (zArr[3]) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "down stream received end seq: " + fVar.f217269f);
                if (h0Var != null) {
                    h0Var.f226977h = java.lang.Integer.valueOf(fVar.f217269f);
                }
            }
            if (h0Var != null && (num = h0Var.f226977h) != null) {
                int intValue = num.intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "received seq: ".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, d83.k0.f226987d, 31, null)));
                if (!linkedList.isEmpty()) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        if (((com.tencent.wechat.aff.ilink_stream.u) it.next()).f217305d >= intValue) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    ((d83.f0) h0Var.f226978i).h();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "onDownStreamEnd");
                }
            }
        }
    }

    private void ZIDL_JI(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217209c;
        sb6.append(concurrentHashMap.size());
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", "onStreamReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ilink_stream.l lVar = (com.tencent.wechat.aff.ilink_stream.l) entry.getValue();
            com.tencent.wechat.aff.ilink_stream.v vVar = (com.tencent.wechat.aff.ilink_stream.v) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.ilink_stream.v.f217308w, bArr);
            d83.t0 t0Var = ((d83.q0) lVar).f227008a;
            d83.t0.a(t0Var);
            if (vVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ILinkStreamController", "onReceive StreamReportNotifyEvent but data is null");
            } else {
                java.lang.String str = vVar.f217324v[3] ? vVar.f217311f : "";
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = t0Var.f227023c;
                d83.h0 h0Var = (d83.h0) concurrentHashMap2.get(str);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = t0Var.f227024d;
                if (h0Var == null) {
                    h0Var = (d83.h0) concurrentHashMap3.get(str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "onReceive StreamReportNotifyEvent clientStreamId: " + str + ", endCode: " + vVar.f217314i + ", upStreamFinished: " + vVar.f217315m + ", downStreamFinished: " + vVar.f217316n + ", lastFragmentReceived: " + vVar.f217317o + ", inStreamList: " + concurrentHashMap2.containsKey(str) + ", inPending: " + concurrentHashMap3.containsKey(str));
                if (h0Var != null && (c0Var = h0Var.f226978i) != null) {
                    ((d83.f0) c0Var).c(vVar);
                }
                d83.h0 h0Var2 = (d83.h0) concurrentHashMap3.remove(str);
                if (h0Var2 != null) {
                    h0Var2.f226973d.clear();
                }
            }
        }
    }

    private void ZIDL_KI(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpStreamFragmentReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217210d;
        sb6.append(concurrentHashMap.size());
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", "onUpStreamFragmentReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ilink_stream.n nVar = (com.tencent.wechat.aff.ilink_stream.n) entry.getValue();
            com.tencent.wechat.aff.ilink_stream.b0 b0Var = (com.tencent.wechat.aff.ilink_stream.b0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.ilink_stream.b0.f217230y, bArr);
            d83.o0 o0Var = (d83.o0) nVar;
            o0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "onReceive UpStreamFragmentReportNotifyEvent");
            d83.t0 t0Var = o0Var.f227003a;
            d83.t0.a(t0Var);
            if (b0Var != null) {
                d83.h0 h0Var = (d83.h0) t0Var.f227023c.get(b0Var.f217248x[3] ? b0Var.f217233f : "");
                if (h0Var != null && (c0Var = h0Var.f226978i) != null) {
                    ((d83.f0) c0Var).b(b0Var);
                }
            }
        }
    }

    private void ZIDL_LI(byte[] bArr) {
        e70.c0 c0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownStreamFragmentReportNotifyEvent size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217211e;
        sb6.append(concurrentHashMap.size());
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannelK", "onDownStreamFragmentReportNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.ilink_stream.j jVar = (com.tencent.wechat.aff.ilink_stream.j) entry.getValue();
            com.tencent.wechat.aff.ilink_stream.g gVar = (com.tencent.wechat.aff.ilink_stream.g) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.ilink_stream.g.f217272u, bArr);
            d83.p0 p0Var = (d83.p0) jVar;
            p0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "onReceive DownStreamFragmentReportNotifyEvent");
            d83.t0 t0Var = p0Var.f227004a;
            d83.t0.a(t0Var);
            if (gVar != null) {
                d83.h0 h0Var = (d83.h0) t0Var.f227023c.get(gVar.f217286t[3] ? gVar.f217275f : "");
                if (h0Var != null && (c0Var = h0Var.f226978i) != null) {
                    ((d83.f0) c0Var).a(gVar);
                }
            }
        }
    }

    public static native void ZIDL_NyGFwFn1D(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_A(long j17, int i17);

    public native void ZIDL_B(long j17, byte[] bArr, byte[] bArr2);

    public native byte[] ZIDL_C(long j17, int i17, byte[] bArr);

    public native byte[] ZIDL_D(long j17, int i17, byte[] bArr);

    public native byte[] ZIDL_E(long j17, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void ZIDL_F(long j17, byte[] bArr);

    public native void ZIDL_G(long j17, byte[] bArr);

    public native void ZIDL_NyGFwFn1C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
