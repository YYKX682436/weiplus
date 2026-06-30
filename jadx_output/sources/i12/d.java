package i12;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f287201a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f287202b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f287203c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f287204d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f287205e;

    public d(android.content.Context context, int i17) {
        this.f287202b = com.tencent.mm.ui.id.b(context).inflate(i17, (android.view.ViewGroup) null);
        a();
    }

    public final void a() {
        android.view.View view = this.f287202b;
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
            return;
        }
        this.f287203c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hhr);
        this.f287204d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hjn);
        this.f287205e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hhm);
    }

    public d(android.content.Context context, android.view.View view) {
        this.f287202b = view;
        a();
    }
}
