package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class fa extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f161028d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f161029e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f161030f;

    public fa(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f161028d = context;
        this.f161029e = recyclerView;
        this.f161030f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f161030f).size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r4.equals("snsapi_health_realtime") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r4.equals("group_sns_userinfo") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0155, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_avatar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r4.equals("snsapi_message") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_chats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r4.equals("snsapi_contact") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0171, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_group_detail;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r4.equals("snsapi_channels_livestream") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_channel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r4.equals("snsapi_channels_useraccountinfo") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r4.equals("snsapi_login") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (r4.equals("group_sns_login") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (r4.equals("snsapi_contact_message") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r4.equals("snsapi_channels_watchstream") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_me;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r4.equals("snsapi_runtime_sdk") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r4.equals("snsapi_runtime_apk") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        if (r4.equals("snsapi_profile") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        if (r4.equals("snsapi_channels_userinfo") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (r4.equals("snsapi_getruntimecode") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
    
        if (r4.equals("group_sns_friend") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        if (r4.equals("snsapi_userinfo") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        if (r4.equals("snsapi_friend") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017c, code lost:
    
        if (r4.equals("snsapi_health_industry") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r4.equals("snsapi_health_history") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x017f, code lost:
    
        r4 = com.tencent.mm.R.raw.icons_outlined_sports;
     */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r3, int r4) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.fa.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f161028d).inflate(com.tencent.mm.R.layout.bp_, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.setting.ui.setting.ea(inflate);
    }
}
