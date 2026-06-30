package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingTingMusicMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "", "Lcom/tencent/mm/plugin/ting/widget/MusicView;", "f", "Lcom/tencent/mm/plugin/ting/widget/MusicView;", "getContent", "()Lcom/tencent/mm/plugin/ting/widget/MusicView;", "setContent", "(Lcom/tencent/mm/plugin/ting/widget/MusicView;)V", "content", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ChattingTingMusicMvvmView extends com.tencent.mm.mvvm.MvvmView<java.lang.Object> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.ting.widget.MusicView content;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingTingMusicMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = new com.tencent.mm.plugin.ting.widget.MusicView(context);
        setContent(musicView);
        return musicView;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public /* bridge */ /* synthetic */ void e(q31.p pVar, q31.p pVar2) {
        android.support.v4.media.f.a(pVar);
        android.support.v4.media.f.a(pVar2);
    }

    public final com.tencent.mm.plugin.ting.widget.MusicView getContent() {
        com.tencent.mm.plugin.ting.widget.MusicView musicView = this.content;
        if (musicView != null) {
            return musicView;
        }
        kotlin.jvm.internal.o.o("content");
        throw null;
    }

    public final void setContent(com.tencent.mm.plugin.ting.widget.MusicView musicView) {
        kotlin.jvm.internal.o.g(musicView, "<set-?>");
        this.content = musicView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingTingMusicMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
