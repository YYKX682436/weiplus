package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class p4 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences f192918a;

    public p4(com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences multiProcessSharedPreferences) {
        this.f192918a = multiProcessSharedPreferences;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.util.List list;
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.util.List list2 = (java.util.List) intent.getSerializableExtra("value");
        if (!this.f192918a.f192417e.equals(stringExtra) || list2 == null) {
            return;
        }
        synchronized (this.f192918a) {
            list = this.f192918a.f192420h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            java.lang.String str = (java.lang.String) list2.get(size);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) ((java.lang.ref.SoftReference) it.next()).get();
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f192918a, str);
                }
            }
        }
    }
}
