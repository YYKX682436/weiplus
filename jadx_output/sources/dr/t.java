package dr;

/* loaded from: classes12.dex */
public abstract class t extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f242402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, android.view.View view) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(view, "view");
        this.f242402c = new java.lang.ref.WeakReference(view);
        dr.s sVar = (dr.s) view.getTag(com.tencent.mm.R.id.dbt);
        if (sVar != null) {
            sVar.a();
        }
        view.setTag(com.tencent.mm.R.id.dbt, this);
    }

    @Override // dr.s
    public void a() {
        super.a();
        java.lang.ref.WeakReference weakReference = this.f242402c;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.dbt, null);
        }
        this.f242402c = null;
    }
}
