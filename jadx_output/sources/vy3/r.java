package vy3;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f441482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f441483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f441484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f441482d = hashMap;
        this.f441483e = kVar;
        this.f441484f = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse response = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        kz5.n0.g0(response.f78708d, ",", null, null, 0, null, vy3.q.f441481d, 30, null);
        java.util.HashMap hashMap = this.f441482d;
        hashMap.put("retCode", 0);
        java.util.ArrayList arrayList = response.f78708d;
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) kz5.n0.a0(arrayList, 0);
        if (addressSelectorContract$AddressNode == null || (str = addressSelectorContract$AddressNode.f78703d) == null) {
            str = "";
        }
        hashMap.put("province", str);
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode2 = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) kz5.n0.a0(arrayList, 1);
        if (addressSelectorContract$AddressNode2 == null || (str2 = addressSelectorContract$AddressNode2.f78703d) == null) {
            str2 = "";
        }
        hashMap.put("city", str2);
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode3 = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) kz5.n0.a0(arrayList, 2);
        if (addressSelectorContract$AddressNode3 == null || (str3 = addressSelectorContract$AddressNode3.f78703d) == null) {
            str3 = "";
        }
        hashMap.put("district", str3);
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode4 = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) kz5.n0.a0(arrayList, 3);
        if (addressSelectorContract$AddressNode4 == null || (str4 = addressSelectorContract$AddressNode4.f78703d) == null) {
            str4 = "";
        }
        hashMap.put("street", str4);
        int size = arrayList.size() - 1;
        while (true) {
            if (-1 >= size) {
                str5 = null;
                break;
            }
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode5 = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) kz5.n0.a0(arrayList, size);
            if (addressSelectorContract$AddressNode5 != null) {
                str5 = java.lang.String.valueOf(addressSelectorContract$AddressNode5.f78704e);
                break;
            }
            size--;
        }
        hashMap.put("nationalCode", str5 != null ? str5 : "");
        this.f441483e.f340863d.e(this.f441484f.f341013c, "showAddressPickerView:ok", hashMap);
        return jz5.f0.f302826a;
    }
}
