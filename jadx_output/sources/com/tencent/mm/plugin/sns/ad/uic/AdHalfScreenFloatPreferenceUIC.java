package com.tencent.mm.plugin.sns.ad.uic;

/* loaded from: classes9.dex */
public final class AdHalfScreenFloatPreferenceUIC extends wm3.j {

    /* renamed from: p, reason: collision with root package name */
    public boolean f163253p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1 f163254q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1] */
    public AdHalfScreenFloatPreferenceUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f163254q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdHalfScreenNotifyFloatPreferenceEvent>(this) { // from class: com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC f163256e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f163256e = this;
                this.__eventId = 1696111990;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdHalfScreenNotifyFloatPreferenceEvent snsAdHalfScreenNotifyFloatPreferenceEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1");
                com.tencent.mm.autogen.events.SnsAdHalfScreenNotifyFloatPreferenceEvent event = snsAdHalfScreenNotifyFloatPreferenceEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                androidx.appcompat.app.AppCompatActivity appCompatActivity = androidx.appcompat.app.AppCompatActivity.this;
                com.tencent.mm.ui.base.preference.MMPreference mMPreference = appCompatActivity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) appCompatActivity : null;
                com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC adHalfScreenFloatPreferenceUIC = this.f163256e;
                if (mMPreference != null) {
                    try {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isRegistered$p", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                        boolean z17 = adHalfScreenFloatPreferenceUIC.f163253p;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isRegistered$p", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                        if (z17) {
                            com.tencent.mars.xlog.Log.w("AdHalfScreenFloatPreferenceUIC", "adHalfScreenFloatPreferenceUIC, already register dataSetObserver");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRegistered$p", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                            adHalfScreenFloatPreferenceUIC.f163253p = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRegistered$p", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                            com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference.getPreferenceScreen();
                            com.tencent.mm.ui.base.preference.h0 h0Var = preferenceScreen instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) preferenceScreen : null;
                            if (h0Var != null) {
                                h0Var.registerDataSetObserver(adHalfScreenFloatPreferenceUIC.f447274g);
                            }
                        }
                    } catch (java.lang.IllegalStateException unused) {
                        com.tencent.mars.xlog.Log.e("AdHalfScreenFloatPreferenceUIC", "already register dataSetObserver");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$postUpdate", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                adHalfScreenFloatPreferenceUIC.U6();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$postUpdate", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
                com.tencent.mars.xlog.Log.i("AdHalfScreenFloatPreferenceUIC", "SnsAdHalfScreenNotifyFloatPreference event called");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC$notifyFloatPreferenceListener$1");
                return true;
            }
        };
    }

    @Override // wm3.j, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = activity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) activity : null;
        if (mMPreference != null) {
            mMPreference.addOnScrollListener(this.f447275h);
            com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference.getPreferenceScreen();
            com.tencent.mm.ui.base.preference.h0 h0Var = preferenceScreen instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) preferenceScreen : null;
            if (h0Var != null) {
                h0Var.a(this.f447273f);
            }
        }
        alive();
        com.tencent.mars.xlog.Log.i("AdHalfScreenFloatPreferenceUIC", "onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
        dead();
        com.tencent.mars.xlog.Log.i("AdHalfScreenFloatPreferenceUIC", "onDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
    }

    @Override // wm3.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
        com.tencent.mars.xlog.Log.i("AdHalfScreenFloatPreferenceUIC", "onResume");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.uic.AdHalfScreenFloatPreferenceUIC");
    }
}
