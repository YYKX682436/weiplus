package f42;

/* loaded from: classes13.dex */
public final class k implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.autogen.events.TelePmEvent telePmEvent = new com.tencent.mm.autogen.events.TelePmEvent();
        telePmEvent.f54887g.f7947c = 1;
        telePmEvent.e();
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return;
        }
        com.tencent.mm.autogen.events.TelePmEvent telePmEvent = new com.tencent.mm.autogen.events.TelePmEvent();
        java.lang.Object obj2 = objArr[0];
        android.telephony.PhoneStateListener phoneStateListener = obj2 instanceof android.telephony.PhoneStateListener ? (android.telephony.PhoneStateListener) obj2 : null;
        if (phoneStateListener == null) {
            phoneStateListener = null;
        }
        am.sy syVar = telePmEvent.f54887g;
        syVar.f7945a = phoneStateListener;
        java.lang.Object obj3 = objArr[1];
        java.lang.Integer num = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        syVar.f7946b = num != null ? num.intValue() : -1;
        syVar.f7947c = 0;
        telePmEvent.e();
    }
}
