package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class pm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sm f199725e;

    public pm(com.tencent.mm.ui.chatting.component.sm smVar, boolean z17) {
        this.f199725e = smVar;
        this.f199724d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f199725e.t0(this.f199724d ? "fromBanner" : "fromPluginTalk");
    }
}
