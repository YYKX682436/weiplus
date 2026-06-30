package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class og implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pg f199643d;

    public og(com.tencent.mm.ui.chatting.component.pg pgVar) {
        this.f199643d = pgVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yb5.d dVar = this.f199643d.f198580d;
        if (dVar != null) {
            com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class));
            jbVar.f199263e.setLbsMode(false);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = jbVar.f199263e;
            chatFooter.Y1 = false;
            chatFooter.H0();
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = jbVar.f199263e;
            chatFooter2.f189954a2 = false;
            android.widget.ImageButton imageButton = chatFooter2.f190103z;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            chatFooter2.r1(true);
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = jbVar.f199263e.f190047q;
            if (weImageButton != null) {
                weImageButton.setVisibility(0);
            }
        }
    }
}
