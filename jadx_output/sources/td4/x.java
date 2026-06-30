package td4;

/* loaded from: classes.dex */
public final class x extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f417742d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f417743e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f417744f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f417745g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f417746h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f417747i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f417748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ td4.g0 f417749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(td4.g0 g0Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f417749n = g0Var;
        this.f417742d = jz5.h.b(new td4.r(itemView));
        this.f417743e = jz5.h.b(new td4.n(itemView));
        this.f417744f = jz5.h.b(new td4.v(itemView));
        this.f417745g = jz5.h.b(new td4.o(itemView));
        this.f417746h = jz5.h.b(new td4.q(itemView));
        this.f417747i = jz5.h.b(new td4.p(itemView));
        this.f417748m = jz5.h.b(new td4.w(itemView));
    }

    public final com.tencent.mm.ui.widget.MMNumberCheckbox i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheckbox", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        java.lang.Object value = ((jz5.n) this.f417743e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.ui.widget.MMNumberCheckbox mMNumberCheckbox = (com.tencent.mm.ui.widget.MMNumberCheckbox) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheckbox", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        return mMNumberCheckbox;
    }

    public final android.widget.ImageView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIvMaskType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        java.lang.Object value = ((jz5.n) this.f417745g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIvMaskType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        return imageView;
    }

    public final android.widget.ImageView k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIvPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        java.lang.Object value = ((jz5.n) this.f417746h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIvPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        return imageView;
    }

    public final android.widget.ImageView l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIvThumb", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        java.lang.Object value = ((jz5.n) this.f417742d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIvThumb", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        return imageView;
    }

    public final android.widget.TextView n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTvMaskDescription", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        java.lang.Object value = ((jz5.n) this.f417744f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTvMaskDescription", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
        return textView;
    }
}
