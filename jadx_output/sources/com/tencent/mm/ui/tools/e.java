package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f210362a;

    /* renamed from: b, reason: collision with root package name */
    public final al5.o4 f210363b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f210364c = false;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g4 f210365d;

    /* renamed from: e, reason: collision with root package name */
    public int f210366e;

    /* renamed from: f, reason: collision with root package name */
    public final int f210367f;

    public e(android.app.Activity activity, al5.o4 o4Var) {
        this.f210365d = new db5.g4(activity);
        this.f210363b = o4Var;
        int b17 = fp.a.b(activity, (int) activity.getResources().getDimension(activity.getResources().getConfiguration().orientation == 2 ? com.tencent.mm.R.dimen.f479622ax : com.tencent.mm.R.dimen.f479623ay));
        this.f210362a = b17;
        this.f210366e = b17 * 3;
        this.f210367f = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f480124op);
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "mDefaultNormalActionbarHeight: %s, needTitleCenterMode: %s.", java.lang.Integer.valueOf(this.f210362a), java.lang.Boolean.valueOf(o4Var.f5977a));
    }
}
