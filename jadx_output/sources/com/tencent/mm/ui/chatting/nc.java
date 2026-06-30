package com.tencent.mm.ui.chatting;

/* loaded from: classes14.dex */
public final class nc implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.pc f202042a;

    public nc(com.tencent.mm.ui.chatting.pc pcVar) {
        this.f202042a = pcVar;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile on user cancel finish");
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.tencent.xweb.o1
    public void c() {
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        kotlin.jvm.internal.o.g(thumbnail, "thumbnail");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onPageCountUpdate " + i17);
        com.tencent.mm.ui.chatting.pc pcVar = this.f202042a;
        com.tencent.mm.ui.zg profilePluginUi = pcVar.getProfilePluginUi();
        if (profilePluginUi != null) {
            profilePluginUi.f212630j = i17;
        }
        com.tencent.mm.ui.zg profilePluginUi2 = pcVar.getProfilePluginUi();
        if (profilePluginUi2 != null) {
            profilePluginUi2.b();
        }
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProfileReadyUI", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        com.tencent.mm.ui.chatting.pc pcVar = this.f202042a;
        com.tencent.mm.ui.zg profilePluginUi = pcVar.getProfilePluginUi();
        if (profilePluginUi != null) {
            profilePluginUi.f212628h = i17;
        }
        com.tencent.mm.ui.zg profilePluginUi2 = pcVar.getProfilePluginUi();
        if (profilePluginUi2 != null) {
            profilePluginUi2.b();
        }
        if (pcVar.f202097m) {
            return;
        }
        pcVar.getClass();
        if (((float) i18) / ((float) i19) >= 1.3333334f) {
            com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
            android.content.Context context = pcVar.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (o1Var.a(context) != 0) {
                android.content.Context context2 = pcVar.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (o1Var.a(context2) != 180) {
                    return;
                }
            }
            pcVar.f202097m = true;
            com.tencent.mm.ui.zg zgVar = pcVar.f202096i;
            if (zgVar != null) {
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                android.content.Context context3 = zgVar.f212621a;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context3);
                e4Var.f211776c = context3.getResources().getString(com.tencent.mm.R.string.h2r);
                e4Var.b(com.tencent.mm.R.drawable.bdu);
                zgVar.f212631k = e4Var.c();
            }
        }
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.tencent.xweb.o1
    public void i() {
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent motionEvent) {
    }
}
