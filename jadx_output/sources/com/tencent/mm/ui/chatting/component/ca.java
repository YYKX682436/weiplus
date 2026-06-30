package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public class ca implements rr.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f198880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f198882c;

    public ca(com.tencent.mm.ui.widget.dialog.u3 u3Var, yb5.d dVar, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f198880a = u3Var;
        this.f198881b = dVar;
        this.f198882c = emojiInfo;
    }

    @Override // rr.o
    public void a(boolean z17) {
        this.f198880a.dismiss();
        if (z17) {
            yb5.d dVar = this.f198881b;
            o22.i.c(dVar.g(), 6, this.f198882c.getMd5(), dVar.x());
        }
    }
}
