package gn5;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.popview.EmojiPopView f273677d;

    public i(com.tencent.mm.view.popview.EmojiPopView emojiPopView) {
        this.f273677d = emojiPopView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nr.f.f339044a.a(3);
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273677d;
        emojiPopView.f213688x = 1;
        emojiPopView.f213680p.setActivated(true);
        emojiPopView.f213680p.setVisibility(0);
        emojiPopView.f213680p.setText(com.tencent.mm.R.string.bx9);
        yj0.a.h(this, "com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
