package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "IPCData", "feature-attachment_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog implements com.tencent.mm.ipcinvoker.j {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/pluginsdk/ui/tools/q5", "feature-attachment_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes8.dex */
    public static final class IPCData implements android.os.Parcelable {
        public static final com.tencent.mm.pluginsdk.ui.tools.q5 CREATOR = new com.tencent.mm.pluginsdk.ui.tools.q5(null);

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f191413d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f191414e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f191415f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f191416g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.Long f191417h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f191418i;

        public IPCData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.String str5) {
            this.f191413d = str;
            this.f191414e = str2;
            this.f191415f = str3;
            this.f191416g = str4;
            this.f191417h = l17;
            this.f191418i = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeString(this.f191413d);
            parcel.writeString(this.f191414e);
            parcel.writeString(this.f191415f);
            parcel.writeString(this.f191416g);
            java.lang.Long l17 = this.f191417h;
            parcel.writeLong(l17 != null ? l17.longValue() : 0L);
            parcel.writeString(this.f191418i);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Long l17;
        com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog.IPCData iPCData = (com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog.IPCData) obj;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent className = new android.content.Intent().setClassName(context, "com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI");
        kotlin.jvm.internal.o.f(className, "setClassName(...)");
        className.setFlags(268435456);
        java.lang.String str6 = "";
        if (iPCData == null || (str = iPCData.f191414e) == null) {
            str = "";
        }
        className.putExtra("file_path", str);
        if (iPCData == null || (str2 = iPCData.f191415f) == null) {
            str2 = "";
        }
        className.putExtra("file_name", str2);
        if (iPCData == null || (str3 = iPCData.f191416g) == null) {
            str3 = "";
        }
        className.putExtra("file_ext", str3);
        if (iPCData == null || (str4 = iPCData.f191413d) == null) {
            str4 = "";
        }
        className.putExtra("to_user", str4);
        className.putExtra("forward_msgid", (iPCData == null || (l17 = iPCData.f191417h) == null) ? 0L : l17.longValue());
        if (iPCData != null && (str5 = iPCData.f191418i) != null) {
            str6 = str5;
        }
        className.putExtra("forward_msg_talker", str6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "invoke", "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "invoke", "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
