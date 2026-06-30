package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class za implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210947e;

    public za(com.tencent.mm.ui.tools.ShowImageUI showImageUI, java.util.ArrayList arrayList) {
        this.f210947e = showImageUI;
        this.f210946d = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210947e;
        g4Var.g(2, showImageUI.getString(com.tencent.mm.R.string.i89), com.tencent.mm.R.raw.icons_outlined_download);
        this.f210946d.add(4);
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        long longExtra = showImageUI.getIntent().getLongExtra("key_message_id", -1L);
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = longExtra;
        b6Var.f6220b = showImageUI.getIntent().getStringExtra("key_message_talker");
        exDeviceHaveBindNetworkDeviceEvent.e();
        if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
            g4Var.g(4, showImageUI.getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
        }
    }
}
