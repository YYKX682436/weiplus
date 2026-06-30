package vq;

/* loaded from: classes.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439159d;

    public g(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        this.f439159d = emojiDebugUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f439159d.e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vq.h holder = (vq.h) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439159d;
        sb6.append(((vq.a) emojiDebugUI.e.get(i17)).c());
        sb6.append(": ");
        java.util.LinkedList linkedList = emojiDebugUI.e;
        sb6.append(((vq.a) linkedList.get(i17)).d());
        java.lang.String sb7 = sb6.toString();
        float b17 = ((vq.a) linkedList.get(i17)).b();
        android.widget.TextView textView = holder.f439162d;
        textView.setText(sb7);
        textView.setBackgroundResource(com.tencent.mm.R.drawable.auo);
        if (b17 > 0.0f) {
            textView.setTextSize(b17);
        } else {
            textView.setTextSize(2, 18.0f);
        }
        textView.setOnClickListener(new vq.f(emojiDebugUI, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(parent.getContext(), null);
        appCompatTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, i65.a.b(parent.getContext(), 48)));
        appCompatTextView.setTextColor(-16777216);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextSize(2, 18.0f);
        return new vq.h(this.f439159d, appCompatTextView);
    }
}
