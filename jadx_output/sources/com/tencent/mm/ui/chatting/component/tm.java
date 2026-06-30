package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExtTranslateVoiceEvent f200019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.xm f200022g;

    public tm(com.tencent.mm.ui.chatting.component.xm xmVar, com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent, int i17, com.tencent.mm.storage.f9 f9Var) {
        this.f200022g = xmVar;
        this.f200019d = extTranslateVoiceEvent;
        this.f200020e = i17;
        this.f200021f = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.storage.f9 f9Var2;
        java.lang.String str;
        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = this.f200019d;
        long longValue = java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue();
        com.tencent.mm.ui.chatting.component.xm xmVar = this.f200022g;
        if (xmVar.q0(longValue)) {
            java.util.ArrayList arrayList = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) xmVar.f198580d.f460708c.a(sb5.z.class))).I.f152065o;
            int i17 = 0;
            while (true) {
                int size = arrayList.size();
                f9Var = this.f200021f;
                if (i17 >= size) {
                    i17 = this.f200020e;
                    break;
                } else if (((rd5.d) arrayList.get(i17)).f394254d.f445300b.getMsgId() == f9Var.getMsgId()) {
                    break;
                } else {
                    i17++;
                }
            }
            am.w8 w8Var = extTranslateVoiceEvent.f54214h;
            if (!w8Var.f8269b) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(w8Var.f8268a)) {
                    xmVar.n0(java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue(), extTranslateVoiceEvent.f54214h.f8268a, com.tencent.mm.ui.chatting.viewitems.io.Transforming);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct refresh msgId:%s", extTranslateVoiceEvent.f54213g.f8178b);
                }
                xmVar.r0();
                xmVar.y0(i17);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(w8Var.f8268a)) {
                am.w8 w8Var2 = extTranslateVoiceEvent.f54214h;
                r45.pv pvVar = w8Var2.f8271d;
                if (w8Var2.f8270c == 2) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = extTranslateVoiceEvent.f54213g.f8178b;
                    if (pvVar == null) {
                        str = "null";
                    } else {
                        str = "[errCode:" + pvVar.f383412d + " errType:" + pvVar.f383413e + " errMsg:" + pvVar.f383414f + ']';
                    }
                    objArr[1] = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice fail msgId:%s cgiBackInfo:%s", objArr);
                    if (pvVar != null) {
                        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(xmVar.f198580d.g(), pvVar.f383413e, pvVar.f383412d, pvVar.f383414f)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice handleErrMsg hit");
                        }
                    }
                    yb5.d dVar = xmVar.f198580d;
                    java.lang.String string = (dVar != null ? dVar.g() : com.tencent.mm.sdk.platformtools.x2.f193071a).getString(com.tencent.mm.R.string.b6a);
                    yb5.d dVar2 = xmVar.f198580d;
                    if (dVar2 != null && dVar2.g() != null) {
                        yb5.d dVar3 = xmVar.f198580d;
                        db5.t7.g(dVar3 != null ? dVar3.g() : com.tencent.mm.sdk.platformtools.x2.f193071a, string);
                    }
                }
                xmVar.w0(java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue());
                xmVar.v0(java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue());
                xmVar.f200258m = false;
                xmVar.r0();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct isCompleted msgId:%s", extTranslateVoiceEvent.f54213g.f8178b);
                am.v8 v8Var = extTranslateVoiceEvent.f54213g;
                com.tencent.mm.storage.f9 f27 = pt0.f0.f2(v8Var.f8183g, java.lang.Long.valueOf(v8Var.f8178b).longValue());
                if (f27 == null || f27.getType() != 34) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TransformComponent", "go VoiceTransTextAct msg is null or not voice msg (maybe msg is revoke)");
                } else {
                    long longValue2 = java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue();
                    synchronized (xmVar) {
                        android.util.Pair pair = (android.util.Pair) com.tencent.mm.ui.chatting.component.xm.f200249t.get(java.lang.Long.valueOf(longValue2));
                        f9Var2 = pair == null ? null : (com.tencent.mm.storage.f9) pair.first;
                    }
                    if (f9Var2 != null) {
                        xmVar.n0(java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue(), extTranslateVoiceEvent.f54214h.f8268a, com.tencent.mm.ui.chatting.viewitems.io.Transformed);
                        f9Var2.l1(f9Var2.F | 64);
                        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var2.getMsgId(), f9Var2, true);
                        xmVar.v0(java.lang.Long.valueOf(extTranslateVoiceEvent.f54213g.f8178b).longValue());
                        xmVar.r0();
                        xmVar.y0(i17);
                    }
                    xmVar.f200258m = false;
                }
            }
            if (34 == f9Var.getType()) {
                com.tencent.mm.ui.chatting.component.xm.f200252w.put(java.lang.Long.valueOf(f9Var.getMsgId()), new com.tencent.mm.ui.chatting.component.wm(f9Var, i17));
            } else {
                xmVar.u0(f9Var, i17);
            }
        }
    }
}
