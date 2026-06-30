package kw4;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f313164a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f313165b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f313167d;

    /* renamed from: e, reason: collision with root package name */
    public final kw4.d f313168e;

    /* renamed from: f, reason: collision with root package name */
    public float f313169f;

    /* renamed from: c, reason: collision with root package name */
    public kw4.c f313166c = kw4.c.None;

    /* renamed from: g, reason: collision with root package name */
    public int f313170g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f313171h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f313172i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f313173j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f313174k = new kw4.a(this);

    public e(android.content.Context context, android.view.View view, kw4.d dVar) {
        this.f313169f = 0.0f;
        this.f313164a = context;
        this.f313168e = dVar;
        this.f313165b = view;
        this.f313167d = new android.view.GestureDetector(context, new kw4.b(this));
        this.f313169f = lw4.h.b(context);
    }
}
