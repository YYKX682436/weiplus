package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEmojiPanelInputComponent;", "Lcom/tencent/mm/emoji/view/EmojiPanelInputComponent;", "", "s", "Z", "isExtraEmojiPanelShow", "()Z", "setExtraEmojiPanelShow", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TextStatusEmojiPanelInputComponent extends com.tencent.mm.emoji.view.EmojiPanelInputComponent {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isExtraEmojiPanelShow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStatusEmojiPanelInputComponent(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.emoji.view.EmojiPanelInputComponent
    public void f(int i17) {
        sr.k kVar = this.f64945q;
        if (kVar != null) {
            kVar.J2(getVisibility() == 0 || this.isExtraEmojiPanelShow, i17 + com.tencent.mm.emoji.view.EmojiPanelInputComponent.f64937r);
        }
    }

    public final void setExtraEmojiPanelShow(boolean z17) {
        this.isExtraEmojiPanelShow = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusEmojiPanelInputComponent(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
