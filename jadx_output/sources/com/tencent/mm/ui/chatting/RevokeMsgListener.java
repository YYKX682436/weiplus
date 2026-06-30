package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class RevokeMsgListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.mc f198303d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f198304e;

    public RevokeMsgListener(com.tencent.mm.ui.chatting.mc mcVar, android.app.Activity activity) {
        super(com.tencent.mm.app.a0.f53288d);
        this.f198303d = null;
        this.f198303d = mcVar;
        this.f198304e = new java.lang.ref.WeakReference(activity);
        this.__eventId = 675629679;
    }

    public final void c(com.tencent.mm.storage.f9 f9Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 != null) {
            try {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(com.tencent.mm.modelcdntran.i2.b("downvideo", h17.f415012j, h17.h(), h17.d()));
                com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgListener", "ashutest::[oneliang][revokeMsgVideo] cancel result:%s", java.lang.Boolean.TRUE);
                t21.p3 Zi = t21.o2.Zi();
                Zi.getClass();
                gm0.j1.d().d(Zi.f414878u);
                Zi.f();
                c01.w9.e(f9Var, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RevokeMsgListener", e17, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent2 = revokeMsgEvent;
        android.app.Activity activity = (android.app.Activity) this.f198304e.get();
        com.tencent.mm.ui.chatting.mc mcVar = this.f198303d;
        if (mcVar != null && revokeMsgEvent2 != null && activity != null) {
            am.cs csVar = revokeMsgEvent2.f54713g;
            long j17 = csVar.f6394a;
            java.lang.String str = csVar.f6395b;
            com.tencent.mm.storage.f9 f9Var = csVar.f6397d;
            if (f9Var == null || f9Var.getMsgId() <= 0) {
                f9Var = csVar.f6397d;
            }
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RevokeMsgListener", "in callback msgInfo null");
            } else {
                int type = f9Var.getType();
                if (type != 3) {
                    if (type == 34) {
                        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
                        extTranslateVoiceEvent.f54213g.f8179c = 1;
                        extTranslateVoiceEvent.e();
                    } else if (type == 43 || type == 62) {
                        android.os.Looper.myLooper();
                        gm0.j1.e().a();
                        int ordinal = mcVar.ordinal();
                        if (ordinal == 0) {
                            c(f9Var);
                        } else if (ordinal == 2) {
                            c(f9Var);
                            if (activity instanceof com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) {
                                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) activity;
                                if (imageGalleryUI.f200611g != null && com.tencent.mm.ui.chatting.gallery.k1.N(f9Var) && f9Var.getMsgId() == imageGalleryUI.f200611g.w().getMsgId()) {
                                    int I7 = imageGalleryUI.I7();
                                    imageGalleryUI.U7();
                                    if (imageGalleryUI.L1 != null) {
                                        imageGalleryUI.U7();
                                        imageGalleryUI.L1.post(new com.tencent.mm.ui.chatting.gallery.z7(imageGalleryUI, I7));
                                    }
                                    db5.e1.G(activity, str, "", false, new com.tencent.mm.ui.chatting.lc(this, activity));
                                }
                            }
                        }
                    }
                } else if (mcVar.ordinal() == 1) {
                    if (f9Var.getMsgId() > 0) {
                        try {
                            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(com.tencent.mm.modelcdntran.i2.b("downimg", f9Var.getCreateTime(), f9Var.Q0(), "" + f9Var.getMsgId()));
                            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] cancel result:%s", java.lang.Boolean.TRUE);
                            c01.d9.e().c(109);
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).e(com.tencent.mm.ui.chatting.gallery.t2.v(f9Var).f322633a, tg3.l1.a(f9Var), 1);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RevokeMsgListener", e17, "[oneliang][revokeMsgImage] cancel failure:%s", e17.getMessage());
                        }
                    }
                    if (activity instanceof com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(((com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) activity).O2));
                    }
                }
            }
        }
        return false;
    }
}
