package iz4;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f296106d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f296107e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f296108f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f296103a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f296104b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f296105c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f296109g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f296110h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f296111i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f296112j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f296113k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f296114l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f296115m = false;

    public int a() {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f296108f;
        if (wXRTEditText != null) {
            return wXRTEditText.getRecyclerItemPosition();
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = this.f296107e;
        if (wXRTEditText2 != null) {
            return wXRTEditText2.getRecyclerItemPosition();
        }
        return -1;
    }

    public java.lang.String b() {
        return "";
    }

    public abstract java.lang.String c();

    public abstract int d();

    public void e() {
        this.f296108f = null;
        this.f296106d = null;
        this.f296107e = null;
        ((java.util.LinkedList) this.f296109g).clear();
    }
}
