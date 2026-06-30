package o12;

/* loaded from: classes10.dex */
public final class j0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView f342159d;

    public j0(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView) {
        this.f342159d = emojiEditorTrimView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f342159d.F.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        o12.i0 holder = (o12.i0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f342159d;
        o12.h0 h0Var = (o12.h0) emojiEditorTrimView.F.get(i17);
        if (h0Var.f342155b == null) {
            o12.f0 callback = emojiEditorTrimView.getCallback();
            long j17 = h0Var.f342154a;
            if (callback != null) {
                java.util.List c17 = kz5.b0.c(java.lang.Long.valueOf(j17));
                p12.w wVar = ((p12.v) callback).f351053a;
                rm5.k kVar = wVar.f351054g;
                if (kVar != null) {
                    ((rm5.h) kVar).a(c17, new p12.u(wVar));
                }
            }
            emojiEditorTrimView.G.add(java.lang.Long.valueOf(j17));
        }
        holder.f342157d.setImageBitmap(h0Var.f342155b);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f342159d;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(emojiEditorTrimView.getThumbSize(), emojiEditorTrimView.getThumbSize()));
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return new o12.i0(imageView);
    }
}
