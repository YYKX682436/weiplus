package n10;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.input.c0 f334043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f334044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n10.m f334045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var, lc3.a0 a0Var, n10.m mVar) {
        super(0);
        this.f334043d = c0Var;
        this.f334044e = a0Var;
        this.f334045f = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.nirvana.input.w wVar = this.f334043d.f65735d;
        n10.k kVar = new n10.k(this.f334045f);
        wVar.getClass();
        lc3.a0 params = this.f334044e;
        kotlin.jvm.internal.o.g(params, "params");
        if (wVar.f65801a != null) {
            java.lang.String optString = params.optString(ya.b.METHOD);
            com.tencent.mars.xlog.Log.i("TextInputMethodDispatcher", "Received '" + optString + "' message.");
            if (optString != null) {
                boolean z17 = true;
                switch (optString.hashCode()) {
                    case -1779068172:
                        if (optString.equals("TextInput.setPlatformViewClient")) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                int i17 = jSONObject.getInt("platformViewId");
                                boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler = wVar.f65801a;
                                if (textInputMethodHandler != null) {
                                    textInputMethodHandler.setPlatformViewClient(i17, optBoolean);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e17) {
                                kVar.a("error", e17.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case -1015421462:
                        if (optString.equals("TextInput.setEditingState")) {
                            try {
                                org.json.JSONObject optJSONObject = params.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                                if (optJSONObject == null) {
                                    optJSONObject = new org.json.JSONObject();
                                }
                                optJSONObject.toString();
                                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler2 = wVar.f65801a;
                                if (textInputMethodHandler2 != null) {
                                    textInputMethodHandler2.setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState.fromJson(optJSONObject));
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e18) {
                                kVar.a("error", e18.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case -37561188:
                        if (optString.equals("TextInput.setClient")) {
                            try {
                                int optInt = params.optInt(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID);
                                org.json.JSONObject optJSONObject2 = params.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                                if (optJSONObject2 == null) {
                                    com.tencent.mars.xlog.Log.w("TextInputMethodDispatcher", "TextInput.setClient data null");
                                    optJSONObject2 = new org.json.JSONObject();
                                }
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("inputId", 1);
                                jSONObject2.put("dartWidgetId", 1);
                                jSONObject2.put("elementTag", "");
                                jSONObject2.put("keyboardType", "WxKeyboardType.Text");
                                jSONObject2.put("cursorSpacing", 1);
                                optJSONObject2.put("wxInputConfiguration", jSONObject2);
                                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler3 = wVar.f65801a;
                                if (textInputMethodHandler3 != null) {
                                    textInputMethodHandler3.setClient(optInt, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.fromJson(optJSONObject2));
                                }
                                kVar.b(null);
                                break;
                            } catch (java.lang.NoSuchFieldException e19) {
                                com.tencent.mars.xlog.Log.e("TextInputMethodDispatcher", optString + ' ' + e19);
                                kVar.a("error", e19.getMessage(), null);
                                break;
                            } catch (org.json.JSONException e27) {
                                com.tencent.mars.xlog.Log.e("TextInputMethodDispatcher", optString + ' ' + e27);
                                kVar.a("error", e27.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 270476819:
                        if (optString.equals("TextInput.hide")) {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler4 = wVar.f65801a;
                            if (textInputMethodHandler4 != null) {
                                textInputMethodHandler4.hide();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 270803918:
                        if (optString.equals("TextInput.show")) {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler5 = wVar.f65801a;
                            if (textInputMethodHandler5 != null) {
                                textInputMethodHandler5.show();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 649192816:
                        if (optString.equals("TextInput.sendAppPrivateCommand")) {
                            try {
                                java.lang.String string = params.getString("action");
                                java.lang.String string2 = params.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                                android.os.Bundle bundle = new android.os.Bundle();
                                if (string2 != null) {
                                    if (string2.length() <= 0) {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, string2);
                                    }
                                }
                                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler6 = wVar.f65801a;
                                if (textInputMethodHandler6 != null) {
                                    textInputMethodHandler6.sendAppPrivateCommand(string, bundle);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e28) {
                                kVar.a("error", e28.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 1204752139:
                        if (optString.equals("TextInput.setEditableSizeAndTransform")) {
                            try {
                                org.json.JSONObject optJSONObject3 = params.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                                double d17 = optJSONObject3 != null ? optJSONObject3.getDouble("width") : 0.0d;
                                double d18 = optJSONObject3 != null ? optJSONObject3.getDouble("height") : 0.0d;
                                org.json.JSONArray jSONArray = optJSONObject3 != null ? optJSONObject3.getJSONArray("transform") : null;
                                double[] dArr = new double[16];
                                for (int i18 = 0; i18 < 16; i18++) {
                                    dArr[i18] = jSONArray != null ? jSONArray.getDouble(i18) : 0.0d;
                                }
                                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler7 = wVar.f65801a;
                                if (textInputMethodHandler7 != null) {
                                    textInputMethodHandler7.setEditableSizeAndTransform(d17, d18, dArr);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e29) {
                                kVar.a("error", e29.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 1727570905:
                        if (optString.equals("TextInput.finishAutofillContext")) {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler8 = wVar.f65801a;
                            if (textInputMethodHandler8 != null) {
                                textInputMethodHandler8.finishAutofillContext(false);
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 1904427655:
                        if (optString.equals("TextInput.clearClient")) {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler9 = wVar.f65801a;
                            if (textInputMethodHandler9 != null) {
                                textInputMethodHandler9.clearClient();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 2113369584:
                        if (optString.equals("TextInput.requestAutofill")) {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler10 = wVar.f65801a;
                            if (textInputMethodHandler10 != null) {
                                textInputMethodHandler10.requestAutofill();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                }
            }
            kVar.a("error", "notImplemented", null);
        }
        return jz5.f0.f302826a;
    }
}
