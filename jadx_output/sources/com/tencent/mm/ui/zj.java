package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public abstract class zj {
    public static void a(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.event.d.f192370d != null) {
            com.tencent.mm.autogen.events.TraceOperationEvent traceOperationEvent = new com.tencent.mm.autogen.events.TraceOperationEvent();
            am.fz fzVar = traceOperationEvent.f54900g;
            fzVar.getClass();
            fzVar.f6714a = i17;
            traceOperationEvent.e();
        }
    }
}
