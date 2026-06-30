package com.tencent.mm.plugin.profile;

/* loaded from: classes4.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f153464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.app.Activity activity, java.lang.String str, int i17) {
        super(0);
        this.f153464d = activity;
        this.f153465e = str;
        this.f153466f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f153464d;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            db5.t7.e(activity, this.f153465e, this.f153466f);
        }
        return jz5.f0.f302826a;
    }
}
