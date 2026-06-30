package dr0;

/* loaded from: classes12.dex */
public final class j0 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f242436b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f242437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f242438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context) {
        super(true);
        this.f242438d = context;
        jz5.i iVar = jz5.i.f302829d;
        this.f242436b = jz5.h.a(iVar, dr0.i0.f242433d);
        this.f242437c = jz5.h.a(iVar, dr0.h0.f242430d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        try {
            context.registerReceiver(new android.content.BroadcastReceiver() { // from class: com.tencent.mm.matrix.battery.accumulate.ProcLifeAccMonitor$onInit$4$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context2, android.content.Intent intent) {
                    kotlin.jvm.internal.o.g(context2, "context");
                    kotlin.jvm.internal.o.g(intent, "intent");
                    java.lang.String action = intent.getAction();
                    if (action != null) {
                        dr0.j0 j0Var = dr0.j0.this;
                        ((ku5.t0) ku5.t0.f312615d).g(new dr0.g0(j0Var, action));
                    }
                }
            }, intentFilter);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "registerReceiver failed: " + e17.getMessage());
        }
    }

    @Override // ph.f, ph.g
    public boolean a(ph.c batteryState, int i17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        j(batteryState, "BatteryPowerChanged");
        return !this.f354263a;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        kotlin.jvm.internal.o.g(event, "event");
        j(batteryState, event);
        return super.f(batteryState, event);
    }

    public final java.util.Map h() {
        return (java.util.Map) this.f242437c.getValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.f242436b.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f6, code lost:
    
        if (kotlin.jvm.internal.o.b(r3.f302833d, java.lang.String.valueOf(r8)) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0211, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        if (kotlin.jvm.internal.o.b(r3.f302833d, java.lang.String.valueOf(r7)) == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(ph.c r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.j0.j(ph.c, java.lang.String):void");
    }

    public final void k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        jz5.l lVar;
        synchronized (h()) {
            if (h().containsKey(str2) && (lVar = (jz5.l) h().get(str2)) != null) {
                java.lang.String str4 = (java.lang.String) lVar.f302833d;
                if (kotlin.jvm.internal.o.b(str3, str4)) {
                    return;
                }
                ap.a.a(1, "battStateTrack", null, map, str, str2, str4 + ">>" + str3, java.lang.String.valueOf((java.lang.System.currentTimeMillis() - ((java.lang.Number) lVar.f302834e).longValue()) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
            }
        }
    }
}
