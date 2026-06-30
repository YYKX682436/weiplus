package jy3;

/* loaded from: classes9.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(r45.ho hoVar) {
        r45.k06 k06Var;
        java.lang.String str;
        java.lang.String str2;
        if (hoVar == null) {
            return "";
        }
        cl0.g gVar = new cl0.g();
        try {
            gVar.o("resp_handshake_type_flag", hoVar.f376326g);
            int i17 = hoVar.f376326g;
            if ((i17 & 1) != 0) {
                r45.j06 j06Var = hoVar.f376323d;
                if (j06Var != null && (str2 = j06Var.f377474e) != null) {
                    gVar.h("signature_plain_json", str2);
                }
            } else if ((i17 & 2) != 0 && (k06Var = hoVar.f376324e) != null && (str = k06Var.f378275f) != null) {
                gVar.h("signature_plain_json", str);
            }
            r45.j06 j06Var2 = hoVar.f376323d;
            if (j06Var2 != null) {
                if ((j06Var2 != null ? j06Var2.f377473d : null) != null) {
                    gVar.h("ecdsa_signature", android.util.Base64.encodeToString(j06Var2.f377473d.f192156a, 2));
                }
            }
            r45.k06 k06Var2 = hoVar.f376324e;
            if (k06Var2 != null) {
                if ((k06Var2 != null ? k06Var2.f378273d : null) != null) {
                    gVar.h("hmac_signature", android.util.Base64.encodeToString(k06Var2.f378273d.f192156a, 2));
                }
                r45.k06 k06Var3 = hoVar.f376324e;
                if ((k06Var3 != null ? k06Var3.f378274e : null) != null) {
                    gVar.h("local_base_key", android.util.Base64.encodeToString(k06Var3.f378274e.f192156a, 2));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "parse json fail: %s", e17);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final jy3.a b(java.lang.String json) {
        kotlin.jvm.internal.o.g(json, "json");
        jy3.a aVar = new jy3.a();
        cl0.g gVar = new cl0.g(json);
        aVar.f302493a = gVar.optInt("req_handshake_type_flag", 0);
        cl0.g b17 = gVar.b("ecdh_req");
        if (b17 != null) {
            java.lang.String optString = b17.optString("device4wxapp_ecdh_pub_key");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            aVar.f302494b = optString;
            java.lang.String optString2 = b17.optString("wxapp4device_ecdh_pub_key");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            aVar.f302495c = optString2;
            java.lang.String optString3 = b17.optString("local_base_key");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            aVar.f302496d = optString3;
        }
        cl0.g b18 = gVar.b("psk_req");
        if (b18 != null) {
            java.lang.String optString4 = b18.optString("ticket_key");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            aVar.f302497e = optString4;
        }
        cl0.g b19 = gVar.b("handshake_base_req");
        if (b19 != null) {
            java.lang.String optString5 = b19.optString("device_random");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            aVar.f302498f = optString5;
            java.lang.String optString6 = b19.optString("wxapp_random");
            kotlin.jvm.internal.o.f(optString6, "optString(...)");
            aVar.f302499g = optString6;
            java.lang.String optString7 = b19.optString("client_id");
            kotlin.jvm.internal.o.f(optString7, "optString(...)");
            aVar.f302500h = optString7;
            aVar.f302501i = b19.getInt("hw_client_version");
            java.lang.String optString8 = b19.optString("hw_device_type");
            kotlin.jvm.internal.o.f(optString8, "optString(...)");
            aVar.f302502j = optString8;
        }
        return aVar;
    }
}
