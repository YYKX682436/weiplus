package po1;

/* loaded from: classes5.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final po1.d a(com.tencent.wechat.aff.affroam.u device) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(device, "device");
        if (kotlin.jvm.internal.o.b(device.f215989e, "deviceId@roam-at")) {
            return oo1.j.f347145a.a();
        }
        ro1.v vVar = ro1.v.f398014a;
        java.lang.String str = device.f215989e;
        kotlin.jvm.internal.o.f(str, "getDeviceId(...)");
        po1.d e17 = vVar.e(str);
        if (e17 == null) {
            java.util.Iterator it = com.tencent.mm.plugin.exdevice.model.l3.aj().y0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((v32.f) obj).field_deviceId, device.f215989e)) {
                    break;
                }
            }
            v32.f fVar = (v32.f) obj;
            if (fVar != null) {
                java.lang.String field_deviceId = fVar.field_deviceId;
                kotlin.jvm.internal.o.f(field_deviceId, "field_deviceId");
                po1.g a17 = po1.g.f357306d.a(fVar.field_productType);
                java.lang.String field_nickName = fVar.field_nickName;
                kotlin.jvm.internal.o.f(field_nickName, "field_nickName");
                java.lang.String field_nickName2 = fVar.field_nickName;
                kotlin.jvm.internal.o.f(field_nickName2, "field_nickName");
                e17 = new po1.d(field_deviceId, a17, field_nickName, field_nickName2, "", "", "");
            }
        }
        if (e17 != null) {
            return e17;
        }
        java.lang.String str2 = device.f215989e;
        kotlin.jvm.internal.o.f(str2, "getDeviceId(...)");
        po1.g a18 = po1.g.f357306d.a(device.f215988d);
        java.lang.String str3 = device.f215991g;
        kotlin.jvm.internal.o.f(str3, "getDeviceNickname(...)");
        java.lang.String str4 = device.f215991g;
        kotlin.jvm.internal.o.f(str4, "getDeviceNickname(...)");
        java.lang.String str5 = device.f215990f;
        kotlin.jvm.internal.o.f(str5, "getDevicePath(...)");
        return new po1.d(str2, a18, str3, str4, str5, "", "");
    }

    public final po1.d b(java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        int optInt;
        java.lang.String optString2;
        java.lang.String optString3;
        if (str == null || (optString = (jSONObject = new org.json.JSONObject(str)).optString("deviceId", null)) == null || (optInt = jSONObject.optInt("deviceType", -1)) == -1 || (optString2 = jSONObject.optString("deviceNickname", null)) == null) {
            return null;
        }
        java.lang.String optString4 = jSONObject.optString("deviceRemark", "");
        java.lang.String optString5 = jSONObject.optString("devicePath", null);
        if (optString5 == null || (optString3 = jSONObject.optString("deviceUUID", null)) == null) {
            return null;
        }
        java.lang.String optString6 = jSONObject.optString("uriPath", "");
        po1.g a17 = po1.g.f357306d.a(optInt);
        kotlin.jvm.internal.o.d(optString4);
        kotlin.jvm.internal.o.d(optString6);
        return new po1.d(optString, a17, optString2, optString4, optString5, optString3, optString6);
    }
}
