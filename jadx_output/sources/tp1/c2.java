package tp1;

/* loaded from: classes13.dex */
public final class c2 extends com.tencent.mm.sdk.event.n {
    public c2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        android.content.Intent intent;
        com.tencent.mm.autogen.events.OnFragmentResumeEvent event = (com.tencent.mm.autogen.events.OnFragmentResumeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.wm wmVar = event.f54577g;
        if (wmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        androidx.fragment.app.Fragment fragment = wmVar.f8301a;
        kotlin.jvm.internal.o.f(fragment, "fragment");
        java.lang.String str2 = wmVar.f8302b;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = wmVar.f8303c;
        java.lang.String str5 = str4 == null ? "" : str4;
        boolean z17 = wmVar.f8304d;
        long j17 = wmVar.f8305e;
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("key_extra_info")) == null) {
            str = "";
        }
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            up1.b bVar = (up1.b) it.next();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_extraInfo_key", str);
            bVar.v(fragment, str3, str5, z17, intent2, j17);
        }
        return false;
    }
}
