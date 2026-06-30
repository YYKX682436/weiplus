package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class oo implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jo f199656f;

    public oo(com.tencent.mm.ui.chatting.component.jo joVar, android.content.Intent intent, java.lang.String str) {
        this.f199656f = joVar;
        this.f199654d = intent;
        this.f199655e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f199656f.o0(this.f199654d, this.f199655e);
    }
}
