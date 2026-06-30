package io.flutter.view;

/* loaded from: classes14.dex */
class AccessibilityViewEmbedder {
    private static final java.lang.String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final android.view.View rootAccessibilityView;
    private final io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors reflectionAccessors = new io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors();
    private final android.util.SparseArray<io.flutter.view.AccessibilityViewEmbedder.ViewAndId> flutterIdToOrigin = new android.util.SparseArray<>();
    private final java.util.Map<io.flutter.view.AccessibilityViewEmbedder.ViewAndId, java.lang.Integer> originToFlutterId = new java.util.HashMap();
    private final java.util.Map<android.view.View, android.graphics.Rect> embeddedViewToDisplayBounds = new java.util.HashMap();

    /* loaded from: classes14.dex */
    public static class ReflectionAccessors {
        private final java.lang.reflect.Field childNodeIdsField;
        private final java.lang.reflect.Method getChildId;
        private final java.lang.reflect.Method getParentNodeId;
        private final java.lang.reflect.Method getRecordSourceNodeId;
        private final java.lang.reflect.Method getSourceNodeId;
        private final java.lang.reflect.Method longArrayGetIndex;

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Long getChildId(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17) {
            java.lang.reflect.Method method = this.getChildId;
            if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (java.lang.Long) method.invoke(accessibilityNodeInfo, java.lang.Integer.valueOf(i17));
                } catch (java.lang.IllegalAccessException e17) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e17);
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e18);
                }
            } else {
                try {
                    return java.lang.Long.valueOf(((java.lang.Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), java.lang.Integer.valueOf(i17))).longValue());
                } catch (java.lang.ArrayIndexOutOfBoundsException e19) {
                    e = e19;
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (java.lang.IllegalAccessException e27) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e27);
                } catch (java.lang.reflect.InvocationTargetException e28) {
                    e = e28;
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Long getParentNodeId(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            java.lang.reflect.Method method = this.getParentNodeId;
            if (method != null) {
                try {
                    return java.lang.Long.valueOf(((java.lang.Long) method.invoke(accessibilityNodeInfo, new java.lang.Object[0])).longValue());
                } catch (java.lang.IllegalAccessException e17) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e17);
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e18);
                }
            }
            return yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Long getRecordSourceNodeId(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
            java.lang.reflect.Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (java.lang.Long) method.invoke(accessibilityRecord, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e17) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e17);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e18) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e18);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Long getSourceNodeId(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            java.lang.reflect.Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (java.lang.Long) method.invoke(accessibilityNodeInfo, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e17) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e17);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e18) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e18);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getVirtualNodeId(long j17) {
            return (int) (j17 >> 32);
        }

        private static boolean isBitSet(long j17, int i17) {
            return (j17 & (1 << i17)) != 0;
        }

        private static java.lang.Long yoinkParentIdFromParcel(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (isBitSet(readLong, 0)) {
                obtain2.readInt();
            }
            if (isBitSet(readLong, 1)) {
                obtain2.readLong();
            }
            if (isBitSet(readLong, 2)) {
                obtain2.readInt();
            }
            java.lang.Long valueOf = isBitSet(readLong, 3) ? java.lang.Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ReflectionAccessors() {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method method3;
            java.lang.reflect.Method method4;
            java.lang.reflect.Field field;
            java.lang.reflect.Method method5;
            java.lang.reflect.Method method6 = null;
            try {
                method = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = android.view.accessibility.AccessibilityRecord.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused2) {
                io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (android.os.Build.VERSION.SDK_INT <= 26) {
                try {
                    method3 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getParentNodeId", new java.lang.Class[0]);
                } catch (java.lang.NoSuchMethodException unused3) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method3 = null;
                }
                try {
                    method4 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getChildId", java.lang.Integer.TYPE);
                    field = null;
                } catch (java.lang.NoSuchMethodException unused4) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method4 = null;
                    field = null;
                }
                method5 = field;
                method6 = method3;
            } else {
                try {
                    java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = java.lang.Class.forName("android.util.LongArray").getMethod("get", java.lang.Integer.TYPE);
                    field = declaredField;
                    method4 = null;
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused5) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = 0;
                }
            }
            this.getSourceNodeId = method;
            this.getParentNodeId = method6;
            this.getRecordSourceNodeId = method2;
            this.getChildId = method4;
            this.childNodeIdsField = field;
            this.longArrayGetIndex = method5;
        }
    }

    /* loaded from: classes14.dex */
    public static class ViewAndId {

        /* renamed from: id, reason: collision with root package name */
        final int f293395id;
        final android.view.View view;

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof io.flutter.view.AccessibilityViewEmbedder.ViewAndId)) {
                return false;
            }
            io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = (io.flutter.view.AccessibilityViewEmbedder.ViewAndId) obj;
            return this.f293395id == viewAndId.f293395id && this.view.equals(viewAndId.view);
        }

        public int hashCode() {
            return ((this.view.hashCode() + 31) * 31) + this.f293395id;
        }

        private ViewAndId(android.view.View view, int i17) {
            this.view = view;
            this.f293395id = i17;
        }
    }

    public AccessibilityViewEmbedder(android.view.View view, int i17) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i17;
    }

    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i17;
        for (int i18 = 0; i18 < accessibilityNodeInfo.getChildCount(); i18++) {
            java.lang.Long childId = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i18);
            if (childId != null) {
                int virtualNodeId = io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(childId.longValue());
                io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, virtualNodeId);
                if (this.originToFlutterId.containsKey(viewAndId)) {
                    i17 = this.originToFlutterId.get(viewAndId).intValue();
                } else {
                    int i19 = this.nextFlutterId;
                    this.nextFlutterId = i19 + 1;
                    cacheVirtualIdMappings(view, virtualNodeId, i19);
                    i17 = i19;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i17);
            }
        }
    }

    private void cacheVirtualIdMappings(android.view.View view, int i17, int i18) {
        io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, i17);
        this.originToFlutterId.put(viewAndId, java.lang.Integer.valueOf(i18));
        this.flutterIdToOrigin.put(i18, viewAndId);
    }

    private android.view.accessibility.AccessibilityNodeInfo convertToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i17);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i17);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i17 = android.os.Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i17 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        java.lang.Long parentNodeId = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (parentNodeId == null) {
            return;
        }
        java.lang.Integer num = this.originToFlutterId.get(new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(parentNodeId.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = this.flutterIdToOrigin.get(i17);
        if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.f293395id)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i17, viewAndId.view);
    }

    public java.lang.Integer getRecordFlutterId(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (recordSourceNodeId == null) {
            return null;
        }
        return this.originToFlutterId.get(new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue())));
    }

    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View view, int i17, android.graphics.Rect rect) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        java.lang.Long sourceNodeId = this.reflectionAccessors.getSourceNodeId(createAccessibilityNodeInfo);
        if (sourceNodeId == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(sourceNodeId.longValue()), i17);
        return convertToFlutterNode(createAccessibilityNodeInfo, i17, view);
    }

    public boolean onAccessibilityHoverEvent(int i17, android.view.MotionEvent motionEvent) {
        io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = this.flutterIdToOrigin.get(i17);
        if (viewAndId == null) {
            return false;
        }
        android.graphics.Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i18 = 0; i18 < motionEvent.getPointerCount(); i18++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerPropertiesArr[i18] = pointerProperties;
            motionEvent.getPointerProperties(i18, pointerProperties);
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i18, pointerCoords);
            android.view.MotionEvent.PointerCoords pointerCoords2 = new android.view.MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i18] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return viewAndId.view.dispatchGenericMotionEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = this.flutterIdToOrigin.get(i17);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.f293395id, i18, bundle);
    }

    public android.view.View platformViewOfNode(int i17) {
        io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = this.flutterIdToOrigin.get(i17);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.view;
    }

    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
        if (recordSourceNodeId == null) {
            return false;
        }
        int virtualNodeId = io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue());
        java.lang.Integer num = this.originToFlutterId.get(new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, virtualNodeId));
        if (num == null) {
            int i17 = this.nextFlutterId;
            this.nextFlutterId = i17 + 1;
            num = java.lang.Integer.valueOf(i17);
            cacheVirtualIdMappings(view, virtualNodeId, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i18 = 0; i18 < obtain.getRecordCount(); i18++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i18);
            java.lang.Long recordSourceNodeId2 = this.reflectionAccessors.getRecordSourceNodeId(record);
            if (recordSourceNodeId2 == null) {
                return false;
            }
            io.flutter.view.AccessibilityViewEmbedder.ViewAndId viewAndId = new io.flutter.view.AccessibilityViewEmbedder.ViewAndId(view, io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.getVirtualNodeId(recordSourceNodeId2.longValue()));
            if (!this.originToFlutterId.containsKey(viewAndId)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
