package o12;

/* loaded from: classes10.dex */
public final class e0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView f342146d;

    public e0(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView) {
        this.f342146d = emojiEditorTrimView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        o12.f0 callback;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f342146d;
        if (i17 == 0) {
            o12.f0 callback2 = emojiEditorTrimView.getCallback();
            if (callback2 != null) {
                ((p12.v) callback2).b(emojiEditorTrimView.b(emojiEditorTrimView.trimStart + emojiEditorTrimView.f97512J), emojiEditorTrimView.b(emojiEditorTrimView.trimEnd + emojiEditorTrimView.f97512J));
            }
        } else if (i17 == 1 && (callback = emojiEditorTrimView.getCallback()) != null) {
            ((p12.v) callback).a(emojiEditorTrimView.b(emojiEditorTrimView.trimStart + emojiEditorTrimView.f97512J), emojiEditorTrimView.b(emojiEditorTrimView.trimEnd + emojiEditorTrimView.f97512J));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f342146d;
        emojiEditorTrimView.f97512J += i17;
        o12.f0 callback = emojiEditorTrimView.getCallback();
        if (callback != null) {
            ((p12.v) callback).c(emojiEditorTrimView.b(emojiEditorTrimView.trimStart + emojiEditorTrimView.f97512J), emojiEditorTrimView.b(emojiEditorTrimView.trimEnd + emojiEditorTrimView.f97512J), o12.g0.f342149d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
