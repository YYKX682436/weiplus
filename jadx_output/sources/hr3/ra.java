package hr3;

/* loaded from: classes11.dex */
public class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283947d;

    public ra(hr3.va vaVar) {
        this.f283947d = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.va vaVar = this.f283947d;
        vaVar.getClass();
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
        java.lang.String d17 = normalUserFooterPreference.L.d1();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        boolean equals = d17.equals(w00Var.f8248d);
        com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
        if (!equals && (w00Var.f8246b || w00Var.f8247c)) {
            dp.a.makeText(mMActivity.getContext(), w00Var.f8245a ? com.tencent.mm.R.string.aqg : com.tencent.mm.R.string.aqh, 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "voip is running, can't do this");
        } else if (!iq.b.v(mMActivity) && !iq.b.e(mMActivity)) {
            com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
            talkRoomServerEvent.f54883g.f7583a = true;
            talkRoomServerEvent.e();
            if (com.tencent.mm.sdk.platformtools.t8.K0(talkRoomServerEvent.f54884h.f7671a)) {
                vaVar.l();
            } else {
                db5.e1.A(mMActivity, mMActivity.getString(com.tencent.mm.R.string.joc), "", mMActivity.getString(com.tencent.mm.R.string.f490507x1), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new hr3.ba(vaVar), new hr3.ca(vaVar));
            }
        }
        com.tencent.mm.plugin.profile.p2.Bi(vaVar.f284109e.K1.getIntent(), 5, 1, vaVar.f284109e.L.d1());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
