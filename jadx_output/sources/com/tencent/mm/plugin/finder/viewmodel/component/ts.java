package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ts extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f136057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f136058h;

    public ts(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f136057g = ptVar;
        this.f136058h = appCompatActivity;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if ((event instanceof fc2.t) && ((i17 = ((fc2.t) event).f260985d) == 0 || i17 == 4 || i17 == 5 || i17 == 1 || i17 == 7)) {
            return true;
        }
        return (event instanceof ec2.f) && ((ec2.f) event).f250959d == 17;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f136057g;
        if (ptVar.getContext().getResources().getConfiguration().orientation == 2 || (ev6 instanceof ec2.f) || !(ev6 instanceof fc2.t)) {
            return;
        }
        boolean z17 = ptVar.f135620u;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f136058h;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("FinderVideoOrientationUIC", "onEventHappen: error, need to set orientation into android:configChanges in AndroidManifest.xml, activity = " + appCompatActivity);
            return;
        }
        int i17 = ((fc2.t) ev6).f260985d;
        ptVar.f135622w = i17 == 0;
        if (i17 == 1) {
            if (!ptVar.f135619t) {
                ptVar.getContext().setRequestedOrientation(1);
            }
            ptVar.f135615p = null;
            ptVar.f135619t = true;
            return;
        }
        ptVar.f135619t = false;
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "onEventHappen: ev = " + ev6 + ", isLandScapeVideo = " + ptVar.R6("ScrollEvent") + ", activity = " + appCompatActivity.getClass().getSimpleName());
    }
}
