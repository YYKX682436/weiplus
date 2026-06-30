package h10;

/* loaded from: classes15.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final h10.g a(java.util.Map json) {
        java.lang.String str;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i17;
        int[] iArr4;
        h10.i iVar;
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.Object obj = json.get(dm.i4.COL_ID);
        java.lang.Number number = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
        int intValue = number != null ? number.intValue() : -1;
        java.lang.Object obj2 = json.get("flags");
        java.lang.Number number2 = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        int intValue2 = number2 != null ? number2.intValue() : 0;
        java.lang.Object obj3 = json.get("actions");
        java.lang.Number number3 = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
        int intValue3 = number3 != null ? number3.intValue() : 0;
        java.lang.Object obj4 = json.get("maxValueLength");
        java.lang.Number number4 = obj4 instanceof java.lang.Number ? (java.lang.Number) obj4 : null;
        int intValue4 = number4 != null ? number4.intValue() : 0;
        java.lang.Object obj5 = json.get("currentValueLength");
        java.lang.Number number5 = obj5 instanceof java.lang.Number ? (java.lang.Number) obj5 : null;
        int intValue5 = number5 != null ? number5.intValue() : 0;
        java.lang.Object obj6 = json.get("textSelectionBase");
        java.lang.Number number6 = obj6 instanceof java.lang.Number ? (java.lang.Number) obj6 : null;
        int intValue6 = number6 != null ? number6.intValue() : 0;
        java.lang.Object obj7 = json.get("textSelectionExtent");
        java.lang.Number number7 = obj7 instanceof java.lang.Number ? (java.lang.Number) obj7 : null;
        int intValue7 = number7 != null ? number7.intValue() : 0;
        java.lang.Object obj8 = json.get("platformViewId");
        java.lang.Number number8 = obj8 instanceof java.lang.Number ? (java.lang.Number) obj8 : null;
        int intValue8 = number8 != null ? number8.intValue() : 0;
        java.lang.Object obj9 = json.get("scrollChildren");
        java.lang.Number number9 = obj9 instanceof java.lang.Number ? (java.lang.Number) obj9 : null;
        int intValue9 = number9 != null ? number9.intValue() : 0;
        java.lang.Object obj10 = json.get("scrollIndex");
        java.lang.Number number10 = obj10 instanceof java.lang.Number ? (java.lang.Number) obj10 : null;
        int intValue10 = number10 != null ? number10.intValue() : 0;
        java.lang.Object obj11 = json.get("scrollPosition");
        java.lang.Number number11 = obj11 instanceof java.lang.Number ? (java.lang.Number) obj11 : null;
        float floatValue = number11 != null ? number11.floatValue() : 0.0f;
        java.lang.Object obj12 = json.get("scrollExtentMax");
        java.lang.Number number12 = obj12 instanceof java.lang.Number ? (java.lang.Number) obj12 : null;
        float floatValue2 = number12 != null ? number12.floatValue() : 0.0f;
        java.lang.Object obj13 = json.get("scrollExtentMin");
        java.lang.Number number13 = obj13 instanceof java.lang.Number ? (java.lang.Number) obj13 : null;
        float floatValue3 = number13 != null ? number13.floatValue() : 0.0f;
        java.lang.Object obj14 = json.get("rect");
        java.util.Map map = obj14 instanceof java.util.Map ? (java.util.Map) obj14 : null;
        if (map == null) {
            map = kz5.q0.f314001d;
        }
        float f17 = floatValue3;
        java.lang.Object obj15 = map.get("left");
        float f18 = floatValue2;
        java.lang.Number number14 = obj15 instanceof java.lang.Number ? (java.lang.Number) obj15 : null;
        float floatValue4 = number14 != null ? number14.floatValue() : 0.0f;
        java.lang.Object obj16 = map.get("top");
        float f19 = floatValue;
        java.lang.Number number15 = obj16 instanceof java.lang.Number ? (java.lang.Number) obj16 : null;
        float floatValue5 = number15 != null ? number15.floatValue() : 0.0f;
        java.lang.Object obj17 = map.get("right");
        int i18 = intValue10;
        java.lang.Number number16 = obj17 instanceof java.lang.Number ? (java.lang.Number) obj17 : null;
        float floatValue6 = number16 != null ? number16.floatValue() : 0.0f;
        java.lang.Object obj18 = map.get("bottom");
        java.lang.Number number17 = obj18 instanceof java.lang.Number ? (java.lang.Number) obj18 : null;
        h10.e eVar = new h10.e(floatValue4, floatValue5, floatValue6, number17 != null ? number17.floatValue() : 0.0f);
        java.lang.Object obj19 = json.get(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY);
        java.lang.String str2 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj20 = json.get("label");
        java.lang.String str3 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.Object obj21 = json.get("labelAttributes");
        java.util.List list7 = obj21 instanceof java.util.List ? (java.util.List) obj21 : null;
        h10.l lVar = h10.m.f278052d;
        java.util.List list8 = kz5.p0.f313996d;
        if (list7 != null) {
            str = "";
            list = new java.util.ArrayList();
            java.util.Iterator it = list7.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = it;
                h10.m a17 = lVar.a((java.util.Map) it.next());
                if (a17 != null) {
                    list.add(a17);
                }
                it = it6;
            }
        } else {
            str = "";
            list = list8;
        }
        java.lang.Object obj22 = json.get("hint");
        java.lang.String str5 = obj22 instanceof java.lang.String ? (java.lang.String) obj22 : null;
        java.lang.String str6 = str5 == null ? str : str5;
        java.lang.Object obj23 = json.get("hintAttributes");
        java.util.List list9 = obj23 instanceof java.util.List ? (java.util.List) obj23 : null;
        if (list9 != null) {
            java.util.List arrayList = new java.util.ArrayList();
            java.util.Iterator it7 = list9.iterator();
            while (it7.hasNext()) {
                java.util.Iterator it8 = it7;
                h10.m a18 = lVar.a((java.util.Map) it7.next());
                if (a18 != null) {
                    arrayList.add(a18);
                }
                it7 = it8;
            }
            list2 = arrayList;
        } else {
            list2 = list8;
        }
        java.lang.Object obj24 = json.get("value");
        java.lang.String str7 = obj24 instanceof java.lang.String ? (java.lang.String) obj24 : null;
        java.lang.String str8 = str7 == null ? str : str7;
        java.lang.Object obj25 = json.get("valueAttributes");
        java.util.List list10 = obj25 instanceof java.util.List ? (java.util.List) obj25 : null;
        if (list10 != null) {
            java.util.List arrayList2 = new java.util.ArrayList();
            java.util.Iterator it9 = list10.iterator();
            while (it9.hasNext()) {
                java.util.Iterator it10 = it9;
                h10.m a19 = lVar.a((java.util.Map) it9.next());
                if (a19 != null) {
                    arrayList2.add(a19);
                }
                it9 = it10;
            }
            list3 = arrayList2;
        } else {
            list3 = list8;
        }
        java.lang.Object obj26 = json.get("increasedValue");
        java.lang.String str9 = obj26 instanceof java.lang.String ? (java.lang.String) obj26 : null;
        java.lang.String str10 = str9 == null ? str : str9;
        java.lang.Object obj27 = json.get("increasedValueAttributes");
        java.util.List list11 = obj27 instanceof java.util.List ? (java.util.List) obj27 : null;
        if (list11 != null) {
            java.util.List arrayList3 = new java.util.ArrayList();
            java.util.Iterator it11 = list11.iterator();
            while (it11.hasNext()) {
                java.util.Iterator it12 = it11;
                h10.m a27 = lVar.a((java.util.Map) it11.next());
                if (a27 != null) {
                    arrayList3.add(a27);
                }
                it11 = it12;
            }
            list4 = arrayList3;
        } else {
            list4 = list8;
        }
        java.lang.Object obj28 = json.get("decreasedValue");
        java.lang.String str11 = obj28 instanceof java.lang.String ? (java.lang.String) obj28 : null;
        java.lang.String str12 = str11 == null ? str : str11;
        java.lang.Object obj29 = json.get("decreasedValueAttributes");
        java.util.List list12 = obj29 instanceof java.util.List ? (java.util.List) obj29 : null;
        if (list12 != null) {
            java.util.List arrayList4 = new java.util.ArrayList();
            java.util.Iterator it13 = list12.iterator();
            while (it13.hasNext()) {
                java.util.Iterator it14 = it13;
                h10.m a28 = lVar.a((java.util.Map) it13.next());
                if (a28 != null) {
                    arrayList4.add(a28);
                }
                it13 = it14;
            }
            list5 = arrayList4;
        } else {
            list5 = list8;
        }
        java.lang.Object obj30 = json.get("tooltip");
        java.lang.String str13 = obj30 instanceof java.lang.String ? (java.lang.String) obj30 : null;
        java.lang.Object obj31 = json.get("textDirection");
        java.lang.String str14 = obj31 instanceof java.lang.String ? (java.lang.String) obj31 : null;
        int a29 = str14 != null ? com.tencent.mm.sdk.platformtools.b8.a(str14) : 0;
        h10.o oVar = a29 != 0 ? a29 != 1 ? a29 != 2 ? h10.o.f278060d : h10.o.f278062f : h10.o.f278061e : h10.o.f278060d;
        java.lang.Object obj32 = json.get("transform");
        java.util.List list13 = obj32 instanceof java.util.List ? (java.util.List) obj32 : null;
        if (list13 != null) {
            list6 = list;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list13, 10));
            java.util.Iterator it15 = list13.iterator();
            while (it15.hasNext()) {
                arrayList5.add(java.lang.Float.valueOf(((java.lang.Number) it15.next()).floatValue()));
            }
            fArr = kz5.n0.P0(arrayList5);
        } else {
            list6 = list;
            fArr = new float[0];
        }
        java.lang.Object obj33 = json.get("childrenInTraversalOrder");
        java.util.List list14 = obj33 instanceof java.util.List ? (java.util.List) obj33 : null;
        if (list14 != null) {
            fArr2 = fArr;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list14, 10));
            java.util.Iterator it16 = list14.iterator();
            while (it16.hasNext()) {
                arrayList6.add(java.lang.Integer.valueOf(((java.lang.Number) it16.next()).intValue()));
            }
            iArr = kz5.n0.R0(arrayList6);
        } else {
            fArr2 = fArr;
            iArr = new int[0];
        }
        java.lang.Object obj34 = json.get("childrenInHitTestOrder");
        java.util.List list15 = obj34 instanceof java.util.List ? (java.util.List) obj34 : null;
        if (list15 != null) {
            iArr2 = iArr;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(list15, 10));
            java.util.Iterator it17 = list15.iterator();
            while (it17.hasNext()) {
                arrayList7.add(java.lang.Integer.valueOf(((java.lang.Number) it17.next()).intValue()));
            }
            iArr3 = kz5.n0.R0(arrayList7);
        } else {
            iArr2 = iArr;
            iArr3 = new int[0];
        }
        java.lang.Object obj35 = json.get("additionalActions");
        java.util.List list16 = obj35 instanceof java.util.List ? (java.util.List) obj35 : null;
        if (list16 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(list16, 10));
            java.util.Iterator it18 = list16.iterator();
            while (it18.hasNext()) {
                arrayList8.add(java.lang.Integer.valueOf(((java.lang.Number) it18.next()).intValue()));
            }
            iArr4 = kz5.n0.R0(arrayList8);
            i17 = 0;
        } else {
            i17 = 0;
            iArr4 = new int[0];
        }
        java.lang.Object obj36 = json.get("elevation");
        java.lang.Number number18 = obj36 instanceof java.lang.Number ? (java.lang.Number) obj36 : null;
        float floatValue7 = number18 != null ? number18.floatValue() : 0.0f;
        java.lang.Object obj37 = json.get("thickness");
        java.lang.Number number19 = obj37 instanceof java.lang.Number ? (java.lang.Number) obj37 : null;
        float floatValue8 = number19 != null ? number19.floatValue() : 0.0f;
        java.lang.Object obj38 = json.get("headingLevel");
        java.lang.Number number20 = obj38 instanceof java.lang.Number ? (java.lang.Number) obj38 : null;
        if (number20 != null) {
            i17 = number20.intValue();
        }
        int i19 = i17;
        java.lang.Object obj39 = json.get("linkUrl");
        java.lang.String str15 = obj39 instanceof java.lang.String ? (java.lang.String) obj39 : null;
        java.lang.Object obj40 = json.get("role");
        java.lang.String str16 = obj40 instanceof java.lang.String ? (java.lang.String) obj40 : null;
        if (str16 != null) {
            h10.i.f278030d.getClass();
            java.lang.String upperCase = str16.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -1839152142:
                    if (upperCase.equals("STATUS")) {
                        iVar = h10.i.B;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -1812928215:
                    if (upperCase.equals("INCREMENTABLE")) {
                        iVar = h10.i.f278037n;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -1388920405:
                    if (upperCase.equals("ALERT_DIALOG")) {
                        iVar = h10.i.f278040q;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -1109408190:
                    if (upperCase.equals("CHECKABLE")) {
                        iVar = h10.i.f278036m;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -711527608:
                    if (upperCase.equals("TEXT_FIELD")) {
                        iVar = h10.i.f278034h;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -611065103:
                    if (upperCase.equals("PLATFORM_VIEW")) {
                        iVar = h10.i.f278042s;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case -95027416:
                    if (upperCase.equals("TAB_LIST")) {
                        iVar = h10.i.f278045v;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 81338:
                    if (upperCase.equals("ROW")) {
                        iVar = h10.i.f278049z;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 82805:
                    if (upperCase.equals("TAB")) {
                        iVar = h10.i.f278044u;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2064738:
                    if (upperCase.equals("CELL")) {
                        iVar = h10.i.f278048y;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2336762:
                    if (upperCase.equals("LINK")) {
                        iVar = h10.i.f278032f;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2336926:
                    if (upperCase.equals("LIST")) {
                        iVar = h10.i.D;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 62361916:
                    if (upperCase.equals("ALERT")) {
                        iVar = h10.i.C;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 69775675:
                    if (upperCase.equals("IMAGE")) {
                        iVar = h10.i.f278033g;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 78166569:
                    if (upperCase.equals("ROUTE")) {
                        iVar = h10.i.f278041r;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 79578030:
                    if (upperCase.equals("TABLE")) {
                        iVar = h10.i.f278047x;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 551762343:
                    if (upperCase.equals("SCROLLABLE")) {
                        iVar = h10.i.f278035i;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 637834679:
                    if (upperCase.equals("GENERIC")) {
                        iVar = h10.i.F;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 1352567962:
                    if (upperCase.equals("TAB_PANEL")) {
                        iVar = h10.i.f278046w;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 1513294306:
                    if (upperCase.equals("HEADING")) {
                        iVar = h10.i.f278038o;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 1591752212:
                    if (upperCase.equals("LIST_ITEM")) {
                        iVar = h10.i.E;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 1970608946:
                    if (upperCase.equals("BUTTON")) {
                        iVar = h10.i.f278031e;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2016211272:
                    if (upperCase.equals("DIALOG")) {
                        iVar = h10.i.f278039p;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2077048726:
                    if (upperCase.equals("COLUMN_HEADER")) {
                        iVar = h10.i.A;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                case 2127025805:
                    if (upperCase.equals("HEADER")) {
                        iVar = h10.i.f278043t;
                        break;
                    }
                    iVar = h10.i.G;
                    break;
                default:
                    iVar = h10.i.G;
                    break;
            }
        } else {
            iVar = h10.i.G;
        }
        h10.i iVar2 = iVar;
        java.lang.Object obj41 = json.get("controlsNodes");
        return new h10.g(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, intValue9, i18, f19, f18, f17, eVar, str2, str4, list6, str6, list2, str8, list3, str10, list4, str12, list5, str13, oVar, fArr2, iArr2, iArr3, iArr4, floatValue7, floatValue8, i19, str15, iVar2, obj41 instanceof java.util.List ? (java.util.List) obj41 : null);
    }
}
